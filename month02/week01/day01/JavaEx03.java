package month02.week01.day01;

import java.util.Scanner;

public class JavaEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gerliin ungu oroolna nuu (red/yellow/green):");
        String light = sc.next().toLowerCase();

        switch (light) {
            case "red":   System.out.println("Zogs!"); break;
            case "yellow":System.out.println("Belen bai!"); break;
            case "green": System.out.println("Yab!"); break;
            default:
                System.out.println("buruu ungu");
        
        sc.close();
        }
    }
}
