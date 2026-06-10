package month03.week03.day01.backend;

interface Drawable {
    void draw();

    default void drawTwice() {
        System.out.println("---");
        draw();
        draw();
    }    
}

interface Resizable {
    void resize(double factor);
}

public class Circle implements Drawable, Resizable{
    double radius;

    Circle(double radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.println("Circle radius=" + radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
