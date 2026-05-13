package month02.week03.day03;

public class JavaStringdasgal01 {
    public static void main(String[] args) {
        String text = "Java Programming Language";
            System.out.println(text);
            System.out.println(text.charAt(0) + " " + text.charAt(text.length()-1));
            System.out.println(text.contains("Program"));
            System.out.println(text.toUpperCase());
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);

    }
}
