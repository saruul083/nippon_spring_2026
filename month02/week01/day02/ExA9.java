package month02.week01.day02;

import java.util.Scanner;

public class ExA9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gerliin ungu (red/yellow/green)");
        String color = sc.next();
        if (color.equals("red")) {
            System.out.println("Zogs");
        } else if (color.equals("yellow")) {
            System.out.println("Belen bol");
        } else if (color.equals("green")) {
            System.out.println("Ybj bolno");
        }  else {
            System.out.println("Buruu ungu");
        }
        sc.close();
    }
}
