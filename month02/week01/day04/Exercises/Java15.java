package month02.week01.day04.Exercises;

import java.util.Scanner;

public class Java15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n oruulna nuu");
        int n = sc.nextInt();
        System.out.println("1-" + n + " ankhnii toonood: ");
        for(int i = 2; i <n; i++) {
            for(int j = 2; j <= i; j++) {
                boolean isPrime = (i % j != 0);
                if (isPrime) {
                    System.out.print(j + " ");
                }
            }
        }
        sc.close();
    }
}
