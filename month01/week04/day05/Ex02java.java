package month01.week04.day05;

import java.util.Scanner;

public class Ex02java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1st product name");
        String name1 = scanner.nextLine();

        System.out.println("1st product cost");
        int cost1 = scanner.nextInt();

        System.out.println("1st product amount");
        int amt1 = scanner.nextInt();

        System.out.println("2nd product name");
        String name2 = scanner.next();
        
        System.out.println("2nd product cost");
        int cost2 = scanner.nextInt();
        
        System.out.println("2nd product amount");
        int amt2 = scanner.nextInt();
        
        System.out.println("3rd product name");
        String name3 = scanner.next();
        
        System.out.println("3rd product cost");
        int cost3 = scanner.nextInt();
        
        System.out.println("3rd product amount");
        int amt3 = scanner.nextInt();
       
        int sum1 = amt1 * cost1;
        int sum2 = amt2 * cost2;
        int sum3 = amt3 * cost3;
        int totalsum = sum1 + sum2 + sum3;
        int huat = totalsum / 10;
        int totalsumwithhuat = totalsum + huat;
        System.out.println("=== Best Store ===");
        System.out.println("1st product name: " + name1);
        System.out.println("1st product cost: " + cost1);
        System.out.println("1st product amount: " + amt1);
        System.out.println("2nd product name: " + name2);
        System.out.println("2nd product cost: " + cost2);
        System.out.println("2nd product amount: " + amt2);
        System.out.println("3rd product name: " + name3);
        System.out.println("3rd product cost: " + cost3);
        System.out.println("3rd product amount: " + amt3);

        System.out.println("==============================");
        System.out.println(name1 + "       x " + amt1 + " + " + sum1);
        System.out.println(name2 + "       x " + amt2 + " = " + sum2);
        System.out.println(name3 + "       x " + amt3 + " = " + sum3);
        System.out.println("------------------------------");
        System.out.println("Total cost:          =   " +  totalsum);
        System.out.println("HUAT (10%)          =   " + huat);
        System.out.println("Total cost(with HUAT)   =  " + totalsumwithhuat);
        System.out.println("==============================");

        scanner.close();
    }
}

