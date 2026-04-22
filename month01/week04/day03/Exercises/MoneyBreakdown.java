package month01.week04.day03.Exercises;
import java.util.Scanner;
public class MoneyBreakdown {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Money");
        int money = scanner.nextInt();

        int money1000 = money / 1000;
        int money500 = money % 1000 / 500;
        int money100 = money % 500 / 100;
        int money50 = money % 100 / 50;

        System.out.println("Money: " + money);
        System.out.println("1000: " + money1000);
        System.out.println("500: " + money500);
        System.out.println("100: " + money100);
        System.out.println("50: " + money50);

        scanner.close();
    }
}
