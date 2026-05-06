package month02.week02.day03.backend;

public class JavaEx02_2 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34, 32, 45};
        int sum = 0;
        System.out.println("3-t huvaagdah toonuud: ");
        for(int n: numbers) {
            if (n % 3 == 0) {
                sum = sum + n;
                System.out.print(n + " ");
            }
        }
        System.out.println("Niilver: " + sum);
    }
}
