package month02.week03.day02.backend;

public class Javadasgal02 {

    static String reverse(String text){
        if (text == null) return null;
        return new StringBuilder(text).reverse().toString();
    }
    static boolean isPalindrome(String s){
        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length / 2; i++ ){
            if (charArray[i] != charArray[charArray.length- 1 - i]) {
                return false;
            }
        }
        return true;
    }
    static int countChar(String input, char target){
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) == target) {
                 count++;
            }
        }
        return count;
    }
    static String repeat(String s, int n){
        String repeating = "";
        for(int i = 1; i <= n; i++){
            repeating += s;
        }
        return repeating;
    }
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(countChar("programming", 'g'));
        System.out.println(repeat("ab", 3));
    }
}
