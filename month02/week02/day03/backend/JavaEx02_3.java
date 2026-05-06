package month02.week02.day03.backend;

import java.util.Scanner;

public class JavaEx02_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[8];

        System.out.println("8 too oruulna nuu");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println((i+1) + " deh too:");
            numbers[i] = sc.nextInt();
        }
        System.out.println("10-aas ih toonuud: ");
        for(int n:numbers) {
            if (n > 10) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}
