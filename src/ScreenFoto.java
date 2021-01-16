import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import java.io.FileInputStream;
import java.io.InputStream;

public class ScreenFoto {
    public static void main(String[] args) {

        String ACCESS_TOKEN = "sl.Ape7fzDbU6pAFpTqdquPJO94yekCkgDy9DTxX-FaOy3JagSYd15Ys9kLhZ59bDWIVIt9Dhd_FOhKJ9MdJ820SaFBj_FoNftCuNglyAPCOsFkrPAyEzPZc129hUauzzrUSjvfc3w";

        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        try {
            InputStream in = new FileInputStream("D:/SkillBox/IntensJ0114/camomile_PNG666.png");
            client.files().uploadBuilder("/test.txt").uploadAndFinish(in);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }



//        UplpadDbox trhread = new UplpadDbox();
//        trhread.start();
    }
}
