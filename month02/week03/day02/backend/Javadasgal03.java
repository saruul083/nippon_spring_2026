package month02.week03.day02.backend;

import java.util.Scanner;

public class Javadasgal03 {

    static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }
    static Double celsiusToKelvin(double c){
        return c + 273.15;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Celsius oruulna uu");
        double c = sc.nextDouble();
        System.out.println("--- Hurvuulelt ---");
        System.out.println("Celsius:     " + String.format("%.2f", c) + "C");
        System.out.println("Fahreiheit:  " + String.format("%.2f", celsiusToFahrenheit(c)) + "F");
        System.out.println("Kelvin:      " + String.format("%.2f", celsiusToKelvin(c)) + "K");
        sc.close();
    }
}
