package month02.week02.JavaReadingMaterials;

public class JavaEx07 {
    public static void main(String[] args) {
        int[] temps = {-3, 12, 8, 25, 19, -1, 31};
        int max = 0;
        int min = 99999;
        for(int n:temps) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
    }
}
