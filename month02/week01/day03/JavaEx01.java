package month02.week01.day03;

import java.util.Scanner;

public class JavaEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sar (1-12)");
        int sar = sc.nextInt();

        switch (sar) {
            case 1: System.out.println("Neg dugeer sar"); break;
            case 2: System.out.println("hoyr dugeer sar"); break;
            case 3: System.out.println("gurav dugeer sar"); break;
            case 4: System.out.println("duruv dugeer sar"); break;
            case 5: System.out.println("tav dugeer sar"); break;
            case 6: System.out.println("zurga dugeer sar"); break;
            case 7: System.out.println("doloo dugeer sar"); break;
            case 8: System.out.println("Naim dugeer sar"); break;
            case 9: System.out.println("ys dugeer sar"); break;
            case 10: System.out.println("arav dugeer sar"); break;
            case 11: System.out.println("aravan neg dugeer sar"); break;
            case 12: System.out.println("aravan hoyr dugeer sar"); break;
        
            default: System.out.println("Buruu orolt");
                break;
        }
        sc.close();
    }
}
