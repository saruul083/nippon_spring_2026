package month01.week04.day02.Exercises;
import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Height");
        int height = scanner.nextInt();

        System.out.println("Width");
        int width = scanner.nextInt();

        int primeter = (height + width) * 2;
        int area = height * width;

        System.out.println("Primeter: " + primeter);
        System.out.println("Area: " + area);
    scanner.close();
    }
    
}
