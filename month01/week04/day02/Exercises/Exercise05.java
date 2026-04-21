package month01.week04.day02.Exercises;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Suuri");
        double suuri = scanner.nextDouble();

        System.out.println("Undur");
        double undur = scanner.nextDouble();

        double talbai = suuri * undur / 2;

        System.out.println("triangle area is " + talbai);
    
        scanner.close();
    }
    
}
