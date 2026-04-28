package month02.week01.day02;

import java.util.Scanner;

public class ExA10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Too oruulna nuu");
        int n = sc.nextInt();
        String shinj1 = "";
        String shinj2 = "";
        String shinj3 = "";
        String shinj4 = "";

        if (n > 0 ) {
            shinj1 = "eireg";
        } else if (n < 0) {
            shinj1 = "surug";
        } else {
            shinj1 = "teg";
        }

        if (n % 2 == 0) {
            shinj2 = "Tegsh";
        } else {
            shinj2 = "Sondgoi";
        }
        
        if (n % 5 == 0) {
            shinj3 = "yes";                        
        } else {
            shinj3 = "no";
        }
        
        int absN = Math.abs(n);
        if (absN < 10) {
            shinj4 = "1 orontoi";
        } else if (absN < 100) {
            shinj4 = "2 orontoi";
        } else {
            shinj4 = "3 ba 3-as olon orontoi";
        }

        System.out.println(n + " gedeg too ni " + shinj1 + " / " + shinj2 + " /5-d huvaagdah: " + shinj3 + " / " +  shinj4);
        sc.close();
    }
}
