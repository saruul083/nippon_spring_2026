package month02.week01.day03;

import java.util.Scanner;

public class JavaEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        System.out.println("Ehnii too");
        double neg = sc.nextDouble();

        System.out.println("Hoyr too");
        double hoyr = sc.nextDouble();

        System.out.println("Uildel(+, -, *, /)");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                sum = neg + hoyr;
                System.out.println(sum);
                break;
            case '-':
                sum = neg - hoyr;
                System.out.println(sum);
                break;
            case '*':
                sum = neg * hoyr;
                System.out.println(sum);
                break;
            case '/':
                if (hoyr == 0) {
                    System.out.println("aldaa: 0-d huvaah bolomjgui");
                } else {
                sum = neg / hoyr;
                System.out.println(sum);
                }
                break;
        
            default:
                System.out.println("Buruu operator");
                break;
        }
        sc.close();
    }
}
