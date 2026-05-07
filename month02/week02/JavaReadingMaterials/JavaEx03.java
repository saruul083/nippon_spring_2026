package month02.week02.JavaReadingMaterials;

public class JavaEx03 {
    public static void main(String[] args) {
    int[][] grid = {
    {1,  2,  3,  4},
    {5,  6,  7,  8},
    {9, 10, 11, 12}
    };
    System.out.println(grid[0][3]);
    System.out.println(grid[2][0]);
    System.out.println(grid[1][1]);
    System.out.println(grid[grid.length - 1][grid[0].length - 1]);
    }
}
