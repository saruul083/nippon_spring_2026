package month01.week04.day03.Homework;
import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Total Minutes");
        int totalmin = scanner.nextInt();

        int hour = totalmin / 60;
        int min = totalmin % 60;

        System.out.println("Total minutes");
        System.out.println(hour + " hours" + min + " mins");

    scanner.close();
    }
}
