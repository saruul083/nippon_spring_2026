package month01.week04.day02.Exercises;
import java.util.Scanner;
public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight");
        double weight = scanner.nextDouble();
        
        System.out.println("Height");
        double height = scanner.nextDouble();

        double bmi = weight / height / height;

        System.out.println("BMI: " + bmi);

        scanner.close();
    }
}
