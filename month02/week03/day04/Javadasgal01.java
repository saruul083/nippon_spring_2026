package month02.week03.day04;

public class Javadasgal01 {
    static int factrorial(int n) {
        if (n == 0) return 1;
        return n * factrorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factrorial(4));
    }
}
