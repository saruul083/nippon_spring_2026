package month02.week03.day04;

public class Javadasgal2_07 {
    static int powerI(int x, int n){
        int result = 1;
        for(int i = 1; i <=n; i++){
            result *= x;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(powerI(2, 4));
    }
}
