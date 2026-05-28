package month03.week01.day02.backend;

public class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    double area() { return 0; }
    double perimeter() {return 0; }
    void showInfo() {
        System.out.printf("%s [%s}]: Talbai=%.2f, Permiter=%.2f%n", getClass().getSimpleName(), color, area(), perimeter());
    }

}
