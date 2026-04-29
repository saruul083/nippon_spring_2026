package month02.week01.day03;

import java.util.Scanner;

public class JavaEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sar");
        int sar = sc.nextInt();

        switch (sar) {
            case 12: 
            case 1:
            case 2:            
                System.out.println("Uvul");    
            break;
        
            case 3: 
            case 4:
            case 5:            
                System.out.println("Havar");
            break;
        
            case 6: 
            case 7:
            case 8:            
                System.out.println("Zun");    
            break;
        
            case 9: 
            case 11:
            case 10:            
                System.out.println("Namar");    
            break;
        
            default:
                System.out.println("buruu orolt");
                break;
        }
        sc.close();
    }
}
