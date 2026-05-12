package month02.week03.day02.backend;

import java.util.Scanner;

public class Javadasgal04 {
    static double circleArea(double r){
        return Math.PI * r * r;
    }
    static double circlerPerimeter(double r){
        return 2 * Math.PI * r;
    }
    static double rectArea(double w, double h){
        return w * h;
    }
    static double rectPerimeter(double w, double h){
        return (w + h) * 2;
    }
    static double triangleArea(double b, double h){
        return b * h / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("R");
        int r = sc.nextInt();
        System.out.println("Rectangle W");
        int Rw = sc.nextInt();
        System.out.println("Rectangle H");
        int Rh = sc.nextInt();
        System.out.println("Triangle B");
        int Tb = sc.nextInt();
        System.out.println("Triangle H");
        int Th = sc.nextInt();
        System.out.println("=== Helberiin toochooluur ===");
        System.out.println("Toirog (r=" + r + "):");
        System.out.println("  Talbai:    " + String.format("%.2f", circleArea(r)));
        System.out.println("  Perimeter: " + String.format("%.2f", circlerPerimeter(r)));
        System.out.println("Tegsh untsugt (" + Rw + "x" + Rh + "):");
        System.out.println("  Talbai:    " + String.format("%.2f", rectArea(Rw, Th)));
        System.out.println("  Perimeter: " + String.format("%.2f", rectPerimeter(Rw, Th)));
        System.out.println("Gurvaljin  (b=" + Tb + ", h=" + Th + "):");
        System.out.println("  Talbai:    " + String.format("%.2f", triangleArea(Tb, Th)));
        sc.close();
    }
}
