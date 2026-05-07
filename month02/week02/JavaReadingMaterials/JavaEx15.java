package month02.week02.JavaReadingMaterials;

public class JavaEx15 {
    public static void main(String[] args) {
        int[][] grid = {
            {3, 7, 2},
            {9, 1, 15},
            {4, 8, 6}
        };
        int max = 0;
        int maxRow = 0;
        int maxCol = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++) {
                if (max < grid[i][j]) {
                    max = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Hamgiin tom: " + max);
        System.out.println("Bairshil: [" + maxRow + "][" + maxCol + "]");
    }
}
