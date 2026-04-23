package month01.week04.day04;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Money");
        int money = scanner.nextInt();

        System.out.println("Interest");
        int interest = scanner.nextInt();

        double oneyearint = money * interest / 100;

        System.out.println("Money:" + money);
        System.out.println("Interest:" + interest);
        System.out.println("1 year interest:" + oneyearint);
        scanner.close();
    }
}
