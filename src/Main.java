import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Кофе-машина");
        //TODO: read from console
        Scanner scanner = new Scanner(System.in);
        int moneyAmount = scanner.nextInt();
        System.out.println("Вы внесли: " + moneyAmount + " руб.");

        int[] drinkPrices = {150, 80, 20, 40};
        String[] drinkNames = {"капучино", "эспрессо", "вода", "молоко"};

        boolean canBuySomething = false;

        for(int i = 0; i < drinkPrices.length; i = i + 1) {
            if(moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " +
                        drinkNames[i]);
                canBuySomething = true;
            }
        }

        if(canBuySomething == false) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
        }

        //TODO: 2021011_204532
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        System.out.println(formatter.format(now));

        //TODO: get screenshot to BufferedImage
//        BufferedImage image = null;
//        System.out.println(image.getWidth() + "x" + image.getHeight());

        //TODO: send screenshot of code and result with #ilovejava
    }
}