package month01.week04.day02.Exercises;
import java.util.Scanner;
public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Celsius");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + "C = " + fahrenheit + "F" );

    scanner.close();
    }
}
