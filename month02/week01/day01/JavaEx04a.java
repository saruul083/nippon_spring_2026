package month02.week01.day01;

import java.util.Scanner;

public class JavaEx04a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nas oruunlna nuu");
        int age = sc.nextInt();
        
        System.out.println("Dansnii uldegdel oruulna nuu");
        int balance = sc.nextInt();

        if (age >=21 && age <= 65 && balance > 500000) {
            System.out.println("Zeel avch bolno");
        } else {
            System.out.println("Zeel avch bolohgue");
        }
        sc.close();
    }
}
