package month02.week03.day01;

public class Exercises06 {

    static boolean isPositive(int n){
        return n > 0;
    }
    static boolean isNegative(int a){
        return a < 0;
    }
    static String sign(int n) {
        if (n > 0) return "postive";
        if (n < 0) return "negative";
        return "zero";
    }
    static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    static boolean isPrime(int n){

        if(n <= 1) {
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n); i++) {
            if (n % 1 == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
