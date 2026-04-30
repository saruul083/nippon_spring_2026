package month02.week01.day04.Exercises;

import java.util.Scanner;

public class Java09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-10 hoorond too oruulna nuu: ");
        int num = sc.nextInt();
        while (num < 0 || num > 10) {
            System.out.println("Buruu! 1-10 hoorond too oruulna nuu: ");
            num = sc.nextInt();
        }
        System.out.println("Zuv Oruulsan too: " + num);
        sc.close();
    }
}
