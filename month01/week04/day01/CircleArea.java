import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius");
        double radius = scanner.nextDouble();

        double area = radius * radius * Math.PI;

        System.out.println("Area is :" + area);

        scanner.close();
    }
}
