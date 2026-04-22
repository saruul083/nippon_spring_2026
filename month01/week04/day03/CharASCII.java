package month01.week04.day03.Exercises;

public class CharASCII {
    public static void main(String[] args) {
        char c = 'A';
        int code = c;              // 65
        System.out.println(code);  // 65

        char fromCode = (char) 66;
        System.out.println(fromCode);  // B

        // Том → жижиг
        char upper = 'G';
        char lower = (char) (upper + 32);
        System.out.println(lower);  // g
    }
}
