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



//import com.dropbox.core.DbxRequestConfig;
//import com.dropbox.core.v2.DbxClientV2;
//import com.dropbox.core.v2.files.FileMetadata;
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//public class ScreenFoto {
//    public static void main(String[] args) {
//
//        String ACCESS_TOKEN = "sl.Ape7fzDbU6pAFpTqdquPJO94yekCkgDy9DTxX-FaOy3JagSYd15Ys9kLhZ59bDWIVIt9Dhd_FOhKJ9MdJ820SaFBj_FoNftCuNglyAPCOsFkrPAyEzPZc129hUauzzrUSjvfc3w";
//
//        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
//        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
//
//        try {
//            InputStream in = new FileInputStream("D:/SkillBox/IntensJ0114/camomile_PNG666.png");
//            client.files().uploadBuilder("/test.txt").uploadAndFinish(in);
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//
//
////        UplpadDbox trhread = new UplpadDbox();
////        trhread.start();
//    }
//}
