package month03.week03.day01.backend;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.draw();
        c.resize(2);
        c.draw();
        c.drawTwice();
    }
}
