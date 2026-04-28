package month02.week01.day02;

import java.util.Scanner;

public class ExA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a tal: "); int a = sc.nextInt();
        System.out.println("b tal: "); int b = sc.nextInt();
        System.out.println("c tal: "); int c = sc.nextInt();

        if (a == b  && b == c) {
            System.out.println("Tegsh gurvaljin");
        } else if (a == b || a == c || b == c) {
            System.out.println("tegh 2 talt");
        } else if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Gurvaljin bish");
        } else {
            System.out.println("Yriin gurvaljin");
        }
        sc.close();
    }
}
