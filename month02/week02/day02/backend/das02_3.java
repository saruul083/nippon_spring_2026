package month02.week02.day02.backend;

public class das02_3 {
    public static void main(String[] args) {
        int[] arr = {15, 23, 7, 42, 18, 35};
        int target = 42;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Олдсон: index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Олдсонгүй");
        }
    }
}
