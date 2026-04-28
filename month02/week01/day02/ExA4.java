package month02.week01.day02;

import java.util.Scanner;

public class ExA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jin"); double weight = sc.nextDouble();
        System.out.println("Undur"); double height = sc.nextDouble();

        double bmi = weight / height / height;
        
        if (bmi < 18.5) {
            System.out.println("Turanhai");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Heviin");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Iluu jintai");
        } else if (bmi >= 30) {
            System.out.println("Targalalt");
        }
        sc.close();
    }
}
