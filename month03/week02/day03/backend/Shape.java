package month03.week02.day03.backend;

public class Shape {
    String color;
    
    public Shape(String color) {
        this.color = color;
    }

    public double area() {
        return 0.0;
    }

    public double perimeter() {
        return 0.0;
    }

    public void printInfo() {
        System.out.println("Shape has color: " + color + ", area of " + area() + " perimetr of " + perimeter());
    }
}
