package month02.week02.day02.backend;

public class das02_2 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        int max = 0;
        int min = 99999;
        for(int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Hamgiin ih too: " + max);
        System.out.println("Hamgiin baga too: " + min);
    }
}
