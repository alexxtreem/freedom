import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

public class UploadDbox {
    public static void main(String[] args) throws Exception {
        String ACCESS_TOKEN = "sl.ApcxPySBwPIXoaye0Of9eK5DkO7g1yVIwQ61cDdWtXZWdMsoBybggLPH0j2mr7ZH8FkHnQBKJPKXhAoa7TfFT9of3mkg0yk6JAbbqodEeCWvwQXqCTQn5mxEzliVvvkSGDT6F1s";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        ScreenFoto thread = new ScreenFoto(client);
        thread.start();
    }
}

