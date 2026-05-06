package month02.week02.day02.backend;

public class das03_4 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (max1 < numbers[i]) {
                max3 = max2;
                max2 = max1;
                max1 = numbers[i];
            }   else if (numbers[i] > max2) {
                max3 = max2;
                max2 = numbers[i];
            } else if (numbers[i] > max3) {
                max3 = numbers[i];
            }
        }
        System.out.println("Top 1: " + max1);
        System.out.println("Top 2: " + max2);
        System.out.println("Top 3: " + max3);
    }
}
