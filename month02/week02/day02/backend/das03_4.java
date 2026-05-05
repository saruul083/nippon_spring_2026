package month02.week02.day02.backend;

public class das03_4 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        int max01 = 0;
        int max02 = 0;
        int max03 = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (max03 < numbers[i]) {
                max03 = numbers[i];
            }
            if (max02 < max03) {
                max02 = max03
                
            }
        }
        System.out.println("Top 1: " + max01);
        System.out.println("Top 2: " + max02);
        System.out.println("Top 3: " + max03);
    }
}
