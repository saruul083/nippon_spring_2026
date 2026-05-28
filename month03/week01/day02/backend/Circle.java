package month03.week01.day02.backend;

public class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() { return  Math.PI * radius * radius; }

    @Override
    double perimeter() { return 2 * Math.PI * radius;}
}
