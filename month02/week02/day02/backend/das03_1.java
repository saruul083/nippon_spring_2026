package month02.week02.day02.backend;

public class das03_1 {
    public static void main(String[] args) {
        int[] a = {12, 34, 55, 23, 2, 60};
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        avg = sum / a.length;
        System.out.println("dundaj too: " + avg);
        for(int i = 0; i < a.length; i++) {
            if (a[i] >= avg) {
                System.out.println(a[i]);
            }
        }
        
    }
}
