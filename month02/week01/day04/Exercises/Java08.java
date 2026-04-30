package month02.week01.day04.Exercises;

import java.util.Scanner;

public class Java08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Too oruulna nuu");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println("Tsifuruudiin niilber " + sum);
        sc.close();
    }
}
