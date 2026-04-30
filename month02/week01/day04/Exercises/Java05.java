package month02.week01.day04.Exercises;

import java.util.Scanner;

public class Java05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("suuri too: "); int base = sc.nextInt();
        System.out.println("Zereg: "); int exp = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= exp; i++) {
            result = result * base;
        }
        System.out.println(base + "^" + exp + " = " + result);
        sc.close();
    }
}
