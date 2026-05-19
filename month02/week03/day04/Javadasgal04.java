package month02.week03.day04;

public class Javadasgal04 {

    static int countDown(int n) {
        if (n == 0) {
            System.out.println("Boom!");
            return 0;
        }
        System.out.println(n);
        return countDown(n - 1);
    }
    static int sumDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(countDown(3));
    }
}
