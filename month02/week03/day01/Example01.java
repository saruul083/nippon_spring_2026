package month02.week03.day01;

public class Example01 {

    static void printLine(String text) {
        System.out.println(text);
    }

    static int square(int n){
        return n * n;
    }

    static String stringConcat(String text){
        return "Hello, " + text; 
    }

    static void aboutMe() {
        System.out.println("I'm Saruulbilegt");
        System.out.println("I'm 24 y/o");
    }

    static String repeat(String s, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += s;
        }
        return result;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
    // printLine("hello");
    // printLine("Test");
    // int a = square(4);
    // System.out.println(a);
    // int b = square(15);
    // System.out.println(b);
    // System.out.println(square(16));
    //  System.out.println(stringConcat("Saruulbilegt"));
    //  System.out.println(stringConcat("Uchralbileg"));
    //  System.out.println(stringConcat("Baatarkhuu"));
    // aboutMe();
    // aboutMe();
    // aboutMe();
    // System.out.println(repeat("hello ", 3));

    System.out.println(isEven(4));
    System.out.println(isEven(5));
    }
}
