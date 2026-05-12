package month02.week03.day02.backend;

public class Javadasgal06 {
    static char letterGrade(int score){
        if (90 <= score) {
            return 'A';
        } else if(80 <= score){
            return 'B';
        } else if(70 <= score){
            return 'C';
        } else if(60 <= score){
            return 'D';
        } else return 'F';
    }
    static double classAverage(int[] scores){
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }
    static int topScore(int[] scores){
        int max = 0;
        for(int i = 0; i < scores.length; i++){
            if (max < scores[i]) max = scores[i];
        }
        return max;
    }
    static String countPassing(int[] scores){
        int passed = 0;
        for(int i = 0; i < scores.length; i++){
            if (scores[i] >= 60) passed++;
        }
        return passed + " / " + scores.length;
    }
    static void printReport(int[] scores){
        System.out.println("=== Oyutnii dun ===");;
        for(int i = 0; i < scores.length; i++){
            System.out.println((i + 1) + ". " + scores[i] + " → " + letterGrade(scores[i]));
        }
        System.out.println("");
        System.out.println("Dundaj: " + classAverage(scores));
        System.out.println("Hamgiin undur: " + topScore(scores));
        System.out.println("Tentssen: " + countPassing(scores));
        System.out.println("===================");
    }
    public static void main(String[] args) {
        int[] scores = {85, 92, 67, 78, 55};
        printReport(scores);;
    }
}
