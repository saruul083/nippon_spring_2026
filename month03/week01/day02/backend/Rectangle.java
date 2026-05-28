package month03.week01.day02.backend;

public class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() { return width * height; }

    @Override
    double perimeter() { return 2 * (width + height);}
}
