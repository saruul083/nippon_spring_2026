package month02.week02.day02.backend;

import java.util.Scanner;

public class das02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5]; 
        int sum = 0;
        double avg = 0;
        System.out.println("Too oruuna nuu");
        for(int i = 0; i < a.length; i++) {
            System.out.println((1 + i) + " deh too:");
            a[i] = sc.nextInt();
            sum = a[i] + sum;
        }
        avg = sum / a.length;

        System.out.println("Niilver: " + sum);
        System.out.println("Dundaj: " + avg);
        sc.close();
    }
}
