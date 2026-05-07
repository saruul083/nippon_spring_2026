package month02.week02.day04.backend;

public class JavaNemelt01_2 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        for(int n:numbers) {
            if (n % 15 == 0) {
                System.out.println(n + " ni 3 ba 5-d huvaagdna");
            } else if (n % 3 == 0) {
                System.out.println(n + " ni 3-d huvaagdna");
            } else if (n % 5 == 0) {
                System.out.println(n + " ni 5-d huvaagdna");
            }
        }
    }
}
