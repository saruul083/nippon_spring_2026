package month02.week02.day04.backend;

import java.util.Scanner;
import java.util.Arrays;

public class JavaTusul01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Хэдэн тоо оруулах вэ? ");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        int sum = 0; double avg = 0; int min = 9999999; int max = 0; int evenCount = 0; int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + " дахь тоо: ");
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
            if (numbers[i] > max) {
                 max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddSum = oddSum + numbers[i];
            }
        }
        avg = (double) sum / numbers.length;
        System.out.println("========== СТАТИСТИК ==========");
        System.out.print("Ugugdul: ");
        for(int n:numbers){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Niilver: " + sum);
        System.out.println("Dundaj: " + avg);
        System.out.println("Hamgiin ih: " + max);
        System.out.println("Hamgiin baga: " + min);
        System.out.println("Tegsh too: " + evenCount);
        System.out.println("Sondgoi niilver: " + oddSum);
        Arrays.sort(numbers);
        System.out.print("Erembelesn: ");
        for(int n:numbers){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.print("Dundjaas deesh: ");
        for(int n:numbers) {
            if (n > avg) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        System.out.println("===============================");
        sc.close();
    }
}
