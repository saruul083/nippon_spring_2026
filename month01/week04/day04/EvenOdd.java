package month01.week04.day04;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scanner.nextInt();

        String[] results = {"even", "odd"};

        System.out.println(results[num % 2]);

        scanner.close();

    }
}
