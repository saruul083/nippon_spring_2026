package month02.week01.day04.Exercises;

import java.util.Scanner;

public class Java11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, count = -1;
        int num = 1;
        while (num != 0) {
            System.out.println("Too oruulna nuu (0 = duusgah)");
            num = sc.nextInt();
            total = total + num;
            count++;
        }
        double dun = total / count;
        System.out.println("Toonuudiin too: " + count);
        System.out.println("Niilver: " + total);
        System.out.println("Dundaj: " + dun);
        sc.close();
    }
}
