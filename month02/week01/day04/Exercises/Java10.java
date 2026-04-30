package month02.week01.day04.Exercises;

import java.util.Scanner;

public class Java10 {
    public static void main(String[] args) {
        int secret = 42;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);
        int guess = -1;
        while (guess != secret ) {
            System.out.println("Too taana nuu(1-100)");
            guess = sc.nextInt();
            if (guess > secret) {
                System.out.println("Baga too oruulna nuu");
            } else if (guess < secret) {
                System.out.println("Ih too oruulna nuu");
            }
            attempts++;
        }
        System.out.println("Zuv! " + attempts + " oroldlogo hiilee.");
        sc.close();
    }
}
