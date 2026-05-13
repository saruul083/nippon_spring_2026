package month02.week03.day03;

public class Javadasgal04 {
    static int calculate(int a, int b, char op){
        if (op == '+') {
            return a + b; 
        } else if (op == '-'){
            return a - b;
        } else if (op == '*'){
            return a * b;
        } else if (op == '/'){
            return a / b;
        } else {
            return 0;
        }
    }
    static double calculate(double a, double b, char op){
          if (op == '+') {
            return a + b; 
        } else if (op == '-'){
            return a - b;
        } else if (op == '*'){
            return a * b;
        } else if (op == '/'){
            return a / b;
        } else {
            return 0;
        }
    }
    static int calculate(int a, int b){
        return a + b;
    }
    static String calculate(int a, char op){
        if (op == '^') {
            return (a * a) + "";
        } else if (op == 'r'){
            return Math.sqrt(a) + " (√" + a + ")";
        } else {
            return "";
        }
    }
    public static void main(String[] args) {
        System.out.println(calculate(9, 'r'));
    }
}
