import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UplpadDbox extends Thread {
//    FileInputStream inputStream;
//


    @Override
    public void run()
    {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        try {
//            inputStream = new FileInputStream("D:\\SkillBox\\IntensJ0114\\camomile_PNG666.png");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
