package month02.week04.day02.backend;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    boolean isLarger(Circle c) {
        return this.area() > c.area();
    }

    void showInfo() {
        System.out.println("Radius: " + radius + ", Area: " + area() + ", Circumference: " + circumference());
    }
}
