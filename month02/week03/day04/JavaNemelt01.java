package month02.week03.day04;

public class JavaNemelt01 {
    static String format(int n){
        return String.format("%,d", n);
    }
    static String format(double n, int decimals){
        return String.format("%." + decimals + "f" , n);
    }
    static String format(String s, int maxLen){
        return String.format("%." + maxLen + "s", s);
    }
    static String format(int hour, int minute){
        return String.format("%02d:%02d", hour, minute);
    }
    public static void main(String[] args) {
        System.out.println(format(15000000));
        System.out.println(format(3.14554, 2));
        System.out.println(format("Sain uuu", 5));
        System.out.println(format(9, 5));
    }
}
