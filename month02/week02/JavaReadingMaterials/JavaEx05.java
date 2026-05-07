package month02.week02.JavaReadingMaterials;

public class JavaEx05 {
    public static void main(String[] args) {
    char[][] board = {
    {'X', 'O', 'X'},
    {'O', 'X', ' '},
    {' ', 'O', 'X'}
    };

    System.out.println(board[1][1]);
    System.out.println(board[2][2]);
    board[0][1] = '0';
    System.out.println(board[0][1]);
    }
}
