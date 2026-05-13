package month02.week03.day03;

public class Javadasgal03 {
    static String describe(int n){
        return "too: " + n;
    }
    static String describe(String s){
        return "Mur: \"" + s + "\", urt=" + s.length();
    }
    static String describe(boolean b){
        return b ? "Unen" : "Hudal";
    }
    static String describe(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }
    
    public static void main(String[] args) {
        System.out.println(describe(3, 5)); 
    }
}
