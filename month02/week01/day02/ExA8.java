package month02.week01.day02;

import java.util.Scanner;

public class ExA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Niit dun");
        int total = sc.nextInt();

        if (total < 100000) {
            System.out.println("Dun ni " + total);            
        } else if (total >= 100000 && total <= 499999) {
            total = total - total / 20;
            System.out.println("Niit dunees 5% hungulult bolood " + total);
        } else if (total >= 500000 && total <= 999999) {
            total = total - total / 10;
            System.out.println("Niit dunees 10% hungulult bolood " + total);
        } else if (total >= 1000000) {
            total = total - total / 100 * 15;
            System.out.println("Niit dunees 15% hungulult bolood " + total);
        }
        sc.close();
    }
}
