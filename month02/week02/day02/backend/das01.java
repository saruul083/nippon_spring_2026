package month02.week02.day02.backend;

public class das01 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        // String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        // for(int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }

        int[] b = {23, 45, 12, 67, 34};
        int sum = 0;
        for(int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        System.out.println(sum);
    }
}
