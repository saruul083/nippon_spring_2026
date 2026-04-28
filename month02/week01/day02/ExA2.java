package month02.week01.day02;

import java.util.Scanner;

public class ExA2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Jil oruulna nuu");
            int year = sc.nextInt();

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("leap year mun");
            }
            sc.close();
        }
}
