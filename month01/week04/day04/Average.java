package month01.week04.day04;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int num1 = scanner.nextInt();

        System.out.println("Enter number");
        int num2 = scanner.nextInt();

        System.out.println("Enter number");
        int num3 = scanner.nextInt();

        System.out.println("Enter number");
        int num4 = scanner.nextInt();

        System.out.println("Enter number");
        int num5 = scanner.nextInt();

        double sum = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("1st number:" + num1);
        System.out.println("2nd number:" + num2);
        System.out.println("3rd number:" + num3);
        System.out.println("4th number:" + num4);
        System.out.println("5th number:" + num5);

        System.out.println("Average:" + sum);

        scanner.close();
    }
}
