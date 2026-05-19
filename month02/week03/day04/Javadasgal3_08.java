package month02.week03.day04;

public class Javadasgal3_08 {
    static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    static long factorial(long n){
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 12; i++) {
            System.out.printf("%2d! = %d%n", i , factorial(i));
        }
        System.out.println();
        for(int i = 13; i <= 20; i++) {
            System.out.printf("%2d! = %d%n", i , factorial((long) i));
        }
    }
}
