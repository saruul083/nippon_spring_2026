package month02.week02.day02.backend;

public class das03_3 {
    public static void main(String[] args) {
        int[] a = {12, 23, 34, 45, 56, 67, 78};
        int[] reversed = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - 1 - i];
            System.out.println(reversed[i]);
        }
    }
}
