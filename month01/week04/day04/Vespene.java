package month01.week04.day04;

import java.util.Scanner;

public class Vespene {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much km");
        int kilmet = scanner.nextInt();

        System.out.println("litr/km");
        int usage = scanner.nextInt();

        int vespene = kilmet * usage;
        int cost = vespene * 2970;

        System.out.println("km:" + kilmet);
        System.out.println("litr/km:" + usage);
        System.out.println("Used vespene:" + vespene);
        System.out.println("Total cost:" + cost);
        scanner.close();
    }
}
