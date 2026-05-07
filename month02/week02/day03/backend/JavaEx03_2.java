package month02.week02.day03.backend;

public class JavaEx03_2 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34, 32, 45, 35, 56, 54};
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int max1i = 0;
        int max2i = 0;
        int max3i = 0;
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
        for(int i = 0; i < numbers.length; i++) {
            if (max1 == numbers[i]) {
                max1i = i;
            }
            if (max2 == numbers[i]) {
                max2i = i;
            }
            if (max3 == numbers[i]) {
                max3i = i;
            }
        }

        System.out.println("Top 1: " + max1 + ", ni " + max1i + "-r indexd bga");
        System.out.println("Top 2: " + max2 + ", ni " + max2i + "-r indexd bga");
        System.out.println("Top 3: " + max3 + ", ni " + max3i + "-r indexd bga");
    }
}
