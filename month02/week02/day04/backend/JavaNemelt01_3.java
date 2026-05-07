package month02.week02.day04.backend;

public class JavaNemelt01_3 {
    public static void main(String[] args) {
        int[] palind = {1, 2, 3, 2, 1};
        int check = palind.length / 2; 
        boolean palindCheck = true;
        for(int i = 0; i < check; i++) {
            if (palind[i] != palind[palind.length - i - 1]) {
                palindCheck = false;
                break;
            }
        }
        System.out.println(palindCheck);
    }
}
