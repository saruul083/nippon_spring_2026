package month02.week03.day03;

public class JavaStringdasgal02 {
    public static void main(String[] args) {
        boolean validating = false;
        String password = "Mypass123";
        if (password.length() >= 8) {
            validating = true;
        } else {
            validating = false;
        }
        for(int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))) {
                validating = true;
                break;
            }
        }
        validating = false;
        for(int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))) {
                validating = true;
                break;
            }
        }
    }
}
