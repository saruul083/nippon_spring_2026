package month02.week02.day03.backend;

public class JavaEx01_3 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        for(int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }
    }
}
