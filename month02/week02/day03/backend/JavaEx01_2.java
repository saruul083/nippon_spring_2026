package month02.week02.day03.backend;

public class JavaEx01_2 {
    public static void main(String[] args) {
        int[] numbers = {45, -12, 78, -3, 56, -29, 0, 67, 0, 34};
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        System.out.println("Eireg toonuud: ");
        for(int n : numbers) {
            if (n > 0) {
                System.out.print(n + " ");
                positiveCount++;
            }
        }
        System.out.println("Eireg too: " + positiveCount);
        System.out.println("Surug toonuud: ");
        for(int n : numbers) {
            if (n < 0) {
                System.out.print(n + " ");
                negativeCount++;
            }
        }
        System.out.println("Surug too: " + negativeCount);
        System.out.println("nailiin toonuud: ");
        for(int n : numbers) {
            if (n == 0) {
                System.out.print(n + " ");
                zeroCount++;
            }
        }
        System.out.println("0-iin too: " + zeroCount);
    }
}
