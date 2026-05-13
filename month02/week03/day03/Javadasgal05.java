package month02.week03.day03;

public class Javadasgal05 {
    static void print(String text){
        System.out.println(text);
    }
    static void print(String text, int times){
        for(int i = 1; i <= times; i++){
            System.out.print(text + " ");
        }
    }
    static void print(String text, boolean uppercase) {
        if (uppercase) {
            System.out.println(text.toUpperCase());
        } else {
            System.out.println(text.toLowerCase());
        }
    }
    static void print(int number){
        System.out.println(number);
    }
    static void print(double number, int decimals){
        System.out.println(String.format("%." + decimals + "f", number));
    }
    public static void main(String[] args) {
        print(3.1412341, 3);
    }
}
