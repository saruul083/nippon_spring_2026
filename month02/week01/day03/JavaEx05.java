package month02.week01.day03;

import java.util.Scanner;

public class JavaEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Youbi");
        String youbi = sc.nextLine().toLowerCase();

        switch (youbi) {
            case "getsu":
            case "ka":
            case "sui":
            case "moku":
            case "kin":
                System.out.println("Heijitsu");
                break;
            case "do":
            case "nichi":
                System.out.println("Kyuujitsu");
                break;
            default:
                System.out.println("Sonna youbi ha nai");
                break;
        }
        sc.close();
    }
}
