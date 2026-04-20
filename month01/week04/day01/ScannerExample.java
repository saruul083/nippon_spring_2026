import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your name");
        String name = scanner.nextLine();
    
        System.out.println("Give me your age");
        int age = scanner.nextInt();

        System.out.println("Hellom " + name + "! You are " + age + " yeards old");

        scanner.close();
    }    
}
