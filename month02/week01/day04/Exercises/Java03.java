package month02.week01.day04.Exercises;

import java.util.Scanner;

public class Java03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n oruulna nuu");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(n + "! = " + result);
        sc.close();
    }
}
