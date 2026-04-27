package month02.week01.day01;

import java.util.Scanner;

public class JavaEx04b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("odoo giin sar oruulna nuu");
        int season = sc.nextInt();

        switch (season) {
            case 12:
            case 1: 
            case 2: 
                System.out.println("Dulaan baigaarai");  
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Havar tavtai moril!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Zunii haluun mend hurgie!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Namriin mend!");
                break;
            default:
                System.out.println("Tiim sar baihgue");
                break;
        }
        sc.close();
    }
}
