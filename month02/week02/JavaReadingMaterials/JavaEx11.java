package month02.week02.JavaReadingMaterials;

public class JavaEx11 {
    public static void main(String[] args) {
        int[] nums = {3, 8, 7, 12, 5, 4, 9, 16};
        int evenSum = 0;
        for(int n:nums) {
            if (n % 2 == 0) {
                evenSum += n;
            }
        }
        System.out.println(evenSum);
    }
}
