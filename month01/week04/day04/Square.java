package month01.week04.day04;

import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter square's 1 line long");
        int line = scanner.nextInt();

        double area = line * line;
        double primetr = line * 4;
        double diagonal = line * Math.sqrt(2.0);

        System.out.println("Line: " + line);
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: " + primetr);
        System.out.println("Diagonal: " + diagonal);

        scanner.close();
    }
}
