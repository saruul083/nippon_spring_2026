package month02.week03.day03;

public class Javadasgal06 {
    static double area(double radius) {
        return Math.PI * radius * radius;
    }
    static double area(double width, double height){
        return width * height;
    }
    static double area(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public static void main(String[] args) {
        System.out.println(String.format("%.2f", area(5) ));
        System.out.println(String.format("%.2f", area(4,6) ));
        System.out.println(String.format("%.2f", area(3,4,5) ));
    }
}
