package month02.week02.day05.backend;

public class JavaTusul01 {
    public static void main(String[] args) {
        String[] students = {"Bataa", "Saraa", "Dorj", "Naraa", "Bold"};

        System.out.println("===== Дүнгийн Тайлан =====");
        int[][] scores = {
            {85, 90, 78},
            {92, 88, 95},
            {70, 65, 80},
            {96, 91, 89},
            {55, 60, 72}
        };
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < scores.length; i++){
            sum = 0;
            for(int j = 0; j <scores[i].length; j++){
                sum += scores[i][j];
            }
            avg = (double) sum / scores.length;
        
        }
    }
}
