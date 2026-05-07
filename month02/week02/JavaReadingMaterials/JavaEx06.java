package month02.week02.JavaReadingMaterials;

public class JavaEx06 {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 70, 88};
        int sum = 0;
        double avg = 0;
        for(int n:scores) {
            sum += n;
        }
        avg = (double) sum / scores.length;
        System.out.println(avg);
    }
}
