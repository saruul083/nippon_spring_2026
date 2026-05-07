package month02.week02.JavaReadingMaterials;

public class JavaEx10 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = new int[original.length];
        for(int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - i - 1];
        }

    }
}
