package month02.week01.day03;

import java.util.Scanner;

public class JavaEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gerel (red, yellow, green)");
        String ungu = sc.nextLine().toLowerCase();

        switch (ungu) {
            case "red": System.out.println("Stop!"); break;
            case "yellow": System.out.println("Caution!"); break;
            case "green": System.out.println("Go!"); break;
            default:System.out.println("Unknown signal"); break;
        }
        sc.close();
    }
}
