import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name");
        String name = scanner.nextLine();

        System.out.println("Welcome, " + name + "!");

        scanner.close();
    }
}
