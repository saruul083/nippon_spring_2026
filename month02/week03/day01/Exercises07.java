package month02.week03.day01;

public class Exercises07 {
    static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    static int factorialI(int n){
        int result = 1;
        System.out.println("0! = 1");
        for(int i = 1; i <= n; i++) {
            result *= i;
            System.out.println(i + "! = " + result);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorialI(10));
    }
}
