package month02.week01.day02;

import java.util.Scanner;

public class ExA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("onoo oruulna nuu");
        int score = sc.nextInt();
        
                if (score >= 90 && score <= 100) {
                    System.out.println("Dun:A");
                } else if (score >= 89 && score <= 80) {
                    System.out.println("Dun:B");
                } else if (score >= 79 && score <= 70) {
                    System.out.println("Dun:C");
                } else if (score >= 69 && score <= 160) {
                    System.out.println("Dun:D");
                } else if (score >= 0 && score <= 59) {
                    System.out.println("Dun:F");
                } else {
                    System.out.println("Buruu onoo");
                }
        sc.close();
    }
}
