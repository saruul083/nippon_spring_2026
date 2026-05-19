package month02.week03.day04;

public class JavaNemelt02 {
    static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    static int fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static int power(int x, int n){
        if (x == 0) return 1;
        return x * power(x, n - 1);
    }
    static int sumDigits(int n){
        if (n < 10) return n;
        return (n % 10) + sumDigits(n / 10);
    }
    static void printCallStack(int n){
        System.out.println("--- factorianl(" + n + ") alhmuud ---");
        
    }
    public static void main(String[] args) {
        
    }
}
