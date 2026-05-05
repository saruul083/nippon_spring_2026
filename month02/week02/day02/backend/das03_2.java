package month02.week02.day02.backend;

public class das03_2 {
    public static void main(String[] args) {
        int[] a = {12, 23, 34, 45, 56, 67, 78};
        int evenCount = 0;
        int oddSum = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddSum = oddSum + a[i];
            }
        }
        System.out.println("Tegsh too: " + evenCount);
        System.out.println("Sondgoi toonuudiin niilver " + oddSum);
    }
}
