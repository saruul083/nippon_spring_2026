package month01.week04.day02.Exercises;
import java.util.Scanner;
public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product name");
        String product = scanner.nextLine();

        System.out.println("Price");
        int price = scanner.nextInt();

        System.out.println("Amount");
        int amount = scanner.nextInt();

        int sum = amount * price;
        
        System.out.println("--------------");
        System.out.println(product + " x " + amount + " = " + sum + " dollar");

        scanner.close();
    }
}
