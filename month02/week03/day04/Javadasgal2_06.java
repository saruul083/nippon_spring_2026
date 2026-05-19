package month02.week03.day04;

public class Javadasgal2_06 {
    static int f(int n) {
    if (n <= 1) return 1;
    return f(n - 1) + f(n - 3);
}
    public static void main(String[] args) {
        System.out.println(f(3));
        System.out.println(f(0));    
    }
}
