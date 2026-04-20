import java.util.Scanner;
public class Introduce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name");
        String name = scanner.nextLine();
        
        System.out.println("Age");
        int age = scanner.nextInt();

        System.out.println("Favourite food");
        String food = scanner.next();

        System.out.println("My name is " + name + "and i'm " + age + "years old. My favourite food is " + food + ", Thank you" );

        scanner.close();
    }
}
