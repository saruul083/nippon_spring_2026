package month02.week01.day02;

import java.util.Scanner;

public class ExA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sar oruulna nuu(1-12)");
        int month = sc.nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Uvul");
        } else if (month == 3 || month == 4 || month == 5) {
          System.out.println("Havar");  
        } else if (month == 6 || month == 7 || month == 8) {
          System.out.println("Zun");  
        } else if (month == 9 || month == 10 || month == 11) {
          System.out.println("Namar");  
        } 
        sc.close();
    }
    
}
