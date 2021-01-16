import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

public class UploadDbox {
    public static void main(String[] args) throws Exception {
        String ACCESS_TOKEN = "sl.Ape7fzDbU6pAFpTqdquPJO94yekCkgDy9DTxX-FaOy3JagSYd15Ys9kLhZ59bDWIVIt9Dhd_FOhKJ9MdJ820SaFBj_FoNftCuNglyAPCOsFkrPAyEzPZc129hUauzzrUSjvfc3w";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        ScreenFoto thread = new ScreenFoto(client);
        thread.start();
    }
}



//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//public class UplpadDbox extends Thread {
////    FileInputStream inputStream;
////
//
//
//    @Override
//    public void run()
//    {
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            inputStream = new FileInputStream("D:\\SkillBox\\IntensJ0114\\camomile_PNG666.png");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
