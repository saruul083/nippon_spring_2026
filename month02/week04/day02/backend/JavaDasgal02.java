package month02.week04.day02.backend;

public class JavaDasgal02 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        c1.showInfo();
        System.out.println(c1.isLarger(new Circle(3)));
    }
}
