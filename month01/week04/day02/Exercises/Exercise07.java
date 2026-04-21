package month01.week04.day02.Exercises;
import java.util.Scanner;
public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hours");
        int hour = scanner.nextInt();

        System.out.println("Minutes");
        int minute = scanner.nextInt();

        int sum = hour * 60 + minute;

        System.out.println("Sum: " + sum + " minutes");

        scanner.close();
    }
}
