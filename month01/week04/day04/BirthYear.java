package month01.week04.day04;

import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter age");
        int age = scanner.nextInt();

        int birthyear = 2026 - age;

        System.out.println(name + " " + age + "years old, born at " + birthyear + "  year");
        scanner.close();
    }
}
