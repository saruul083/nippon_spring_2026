package month02.week03.day01;

public class Exercises03 {

    static String greetUser(String name, int age) {
        return "Сайн уу, " + name + "! Та " + age + " настай байна.";
    }

    static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        System.out.println(greetUser("Saruulbilegt", 24));

        System.out.println(celsiusToFahrenheit(0));
        System.out.println(celsiusToFahrenheit(100));
    }
}
