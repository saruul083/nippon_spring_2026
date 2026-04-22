package month01.week04.day03.Exercises;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("a");
        int a = scanner.nextInt();

        System.out.println("b");
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int huv = a / b;
        int uld = a % b;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " + " + b + " =  " + sum);
        System.out.println(a + " - " + b + " =  " + sub);
        System.out.println(a + " * " + b + " =  " + mul);
        System.out.println(a + " / " + b + " =  " + huv);
        System.out.println(a + " % " + b + " =  " + uld);

    scanner.close();
    }
}
