package month02.week01.day02;

import java.util.Scanner;

public class ExA7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nuuts ug oruulna nuu");
        String pwd = sc.next();

        boolean hasUpper = !pwd.equals(pwd.toLowerCase());
        boolean hasDigit = pwd.matches(".*\\d.*");
        int len = pwd.length();

        if (len >= 8 && hasDigit && hasUpper) {
            System.out.println("Password huch huchtai bna");
        } else if (len >= 6 && (hasDigit || hasUpper)) {
            System.out.println("Password huch dund bna");
        } else {
            System.out.println("Password huch sul bna");
        }
        sc.close();
    }
}
