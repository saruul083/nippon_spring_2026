package month02.week02.day04.backend;

public class JavaNemelt01_1 {
    public static void main(String[] args) {
        int[] temps = {23, 18, 31, 27, 15, 22, 29, 35, 19, 26};
        int hottestDay = 0;
        for(int n:temps) {
            if (n >= 30) {
                System.out.println(n + "C - haluun!");
            } else if (n <=20) {
                System.out.println(n + "C - huiten!");
            } else {
                System.out.println(n + "C - dulaan!");
            }
            if (n > hottestDay) {
                hottestDay = n;
            }
        }
        System.out.println("Hamgiin haluun udur " + hottestDay + "C tai bna");
    }
}
