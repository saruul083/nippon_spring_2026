package month02.week02.JavaReadingMaterials;

public class JavaEx13 {
    public static void main(String[] args) {
        int[][] scores = {
            {85, 90, 78},
            {92, 88, 95},
            {70, 75, 80}
        };
        for(int i = 0; i < scores.length; i++) {
            int sum = 0;
            for(int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / scores[i].length;
            System.out.printf("%d-r oyutan: niilver%d, dundaj=%.1f%n", i + 1, sum, avg);
        }
    }
}
