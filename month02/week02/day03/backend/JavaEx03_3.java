package month02.week02.day03.backend;

public class JavaEx03_3 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        System.out.println("tegsh ba 10-aas ih toonuud");
        for(int n:numbers) {
            if (n % 2 == 0 && n > 10) {
                System.out.print(n + " ");
            }
        }
        System.out.println("");
        System.out.println("Sondgoi ba 20-oos baga toonuud");
        for(int n:numbers) {
            if (n % 2 == 1 && n < 20) {
                System.out.print(n + " ");
            }
        }
    }
}
