package month01.week04.day03.Exercises;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seconds: ");
        int totalsec = scanner.nextInt();

        int hour = totalsec / 3600;
        int min = totalsec % 3600 / 60;
        int sec = totalsec % 60;

        System.out.println("Total seconds: " + totalsec);
        System.out.println(hour + "hour " + min + "minute " + sec + "second");
        
        scanner.close();
    }
}
