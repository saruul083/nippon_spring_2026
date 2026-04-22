package month01.week04.day03.Homework;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        System.out.println("a");
        int a = scanner.nextInt();

        System.out.println("b");
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " + " + b + " =  " + sum);
        System.out.println(a + " - " + b + " =  " + sub);
        System.out.println(a + " * " + b + " =  " + mul);
    scanner.close();
    }
}
