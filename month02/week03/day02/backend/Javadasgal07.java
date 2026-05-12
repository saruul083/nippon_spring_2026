package month02.week03.day02.backend;

public class Javadasgal07 {
    static String encrypt(String text, int shift){
        int normalizedShift = (shift % 26 + 26) % 26;
        StringBuilder encrypting = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                char cipherChar = (char) ((ch - 'A' + normalizedShift) % 26 + 'A');
                encrypting.append(cipherChar);
                
            } else if (Character.isLowerCase(ch)) {
                char cipherChar = (char) ((ch - 'a' + normalizedShift) % 26 + 'a');
                encrypting.append(cipherChar);
                
            } else {
                encrypting.append(ch);
            }
        }
        return encrypting.toString();
    }
    static String decrypt(String text, int shift){
        int normalizedShift = (shift % 26 + 26) % 26;
        StringBuilder decrypting = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                char cipherChar = (char) ((ch - 'A' - normalizedShift) % 26 + 'A');
                decrypting.append(cipherChar);
            } else if (Character.isLowerCase(ch)) {
                char cipherChar = (char) ((ch - 'a' - normalizedShift) % 26 + 'a');
                decrypting.append(cipherChar);
            } else {
                decrypting.append(ch);
            }
        }
        return decrypting.toString();
    }
    public static void main(String[] args) {
        String text = "Hello World!";   
        System.out.println("Eh bichver: " + text);
        System.out.println("Shift: 3");
        System.out.println("Shifrlegdsen: " + encrypt(text, 3));
        System.out.println("Tailagdsan: " + decrypt(encrypt(text, 3), 3));
    }
}
