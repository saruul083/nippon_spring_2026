package month02.week01.day04.Exercises;

public class Java07 {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;
        while (i > 1) {
            sum = sum + i;         
            System.out.print(i + " ");
            i = i - 10;
        }
        System.out.println("Niilver: " + sum);
    }
}
