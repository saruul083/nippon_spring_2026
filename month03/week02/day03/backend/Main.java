package month03.week02.day03.backend;

public class Main {
    public static void main(String[] args) {
        Shape shape01 = new Shape("yellow");
        shape01.color = "red";

        Triangle triangle01 = new Triangle("green", 10, 15);
        Circle circle01 = new Circle("red", 4);

        System.out.println(circle01.area());
        System.out.println(triangle01.area());
        System.out.println(triangle01.perimeter());
        triangle01.printInfo();

        AbstactShape square = new Square(10);

        square.area();
        square.perimeter();
    }
}
