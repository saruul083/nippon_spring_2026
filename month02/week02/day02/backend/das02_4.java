package month02.week02.day02.backend;

public class das02_4 {
    public static void main(String[] args) {
        int[] a = {12, 32, 45, 23, 56};
        int count = 0;
        for(int i = 0;  i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Tegsh too " + count + " shirheg bna");
        System.out.println("tegsh toonood: ");
        for (int n : a) {
            if (n % 2 == 0) System.out.print(n + " ");
        }
    }    
}
