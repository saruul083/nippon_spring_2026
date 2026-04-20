import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1st number");
        int num1 = scanner.nextInt();

        System.out.println("2nd number");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum is " + sum);

        scanner.close();
    }
}
