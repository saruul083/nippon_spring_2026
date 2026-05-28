package month03.week01.day02.backend;

public class Triangle extends Shape{
    double a, b, c;
    Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a; this.b = b; this.c = c;
    }
    @Override
    double area() { double s = (a + b + c) /2;
        return  Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    double perimeter() { return a + b + c; }
}
