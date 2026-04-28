package month02.week01.day02;

import java.util.Scanner;

public class ExA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jiliin orlogo");
        long income = sc.nextLong();
        if (income <= 10000000) {
            income = income - income / 10 ;
            System.out.println("Tatvar 10%, ur dun ni " + income);
        } else if (income >= 10000001 && income <= 50000000) {
            income = income -  income * 15 / 100;
            System.out.println("Tatvar 15%, ur dun ni " + income);
        } else {
            income = income - income * 20 / 100;
            System.out.println("Tatvar 20%, ur dun ni " + income);
        }
        sc.close();
    }
}
