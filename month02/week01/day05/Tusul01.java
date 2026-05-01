package month02.week01.day05;

import java.util.Scanner;

public class Tusul01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Tavtai moril! ATM ===");
        System.out.println("PIN oruulna nuu: ");
        int pin = sc.nextInt();
        int count = 1;
        long cash = 1000000;
        int check = 3;
        while (pin != 1234) {
            
            System.out.println("Buruu PIN");
            pin = sc.nextInt();
            count ++;
            if (count == 3) {
                System.out.println("Kart haagldaa");
                break;
            }
        }
        boolean running = true;
        while (running) {
            System.out.println("╔═══════════════════╗");
            System.out.println("║   Үйлдэл сонгоно  ║");
            System.out.println("║ 1. Үлдэгдэл       ║");
            System.out.println("║ 2. Мөнгө авах     ║");
            System.out.println("║ 3. Мөнгө хийх     ║");
            System.out.println("║ 4. Гарах          ║");
            System.out.println("╚═══════════════════╝");
            int songolt = sc.nextInt(); 
            if (songolt == 4) {
                break;
            }
            switch (songolt) {
                case 1: System.out.println("Tanii uldeglel: " + cash);
                    System.out.println("Dahin uildel hiihuu? (1-Tiim / 4- garah)");
                    check = sc.nextInt();
                    while (check != 1 && check != 4) {
                        System.out.println("please enter 1-Tiim or 4-garah");
                        check = sc.nextInt();
                    }    
                    if (check == 1) {
                        running = true;
                    } else if(check == 4){
                        running = false;
                    }
                    break;
                case 2: System.out.println("avah dun: ");
                    long pull = sc.nextLong();
                    if (cash < pull) {
                        System.out.println("uldeglel hureltsehgui");
                    } else if (pull >= 500000) {
                        System.out.println("Hyazgaar hiterune");
                    } else if (pull % 1000 != 0) {
                        System.out.println("1000-n urjver oruulna nuu");
                    } else {
                        cash = cash - pull;
                        System.out.println(pull + "$ olgov");
                        System.out.println("Uldeglel: " + cash);
                    }
                    System.out.println("Dahin uildel hiihuu? (1-Tiim / 4- garah)");
                    check = sc.nextInt();
                    while (check != 1 && check != 4) {
                        System.out.println("please enter 1-Tiim or 4-garah");
                        check = sc.nextInt();
                    }
                    if (check == 1) {
                        running = true;
                    } else if(check == 4){
                        running = false;
                    }
                    break;
                case 3: System.out.println("Hediig hiih: ");
                    long add = sc.nextLong();
                    if (add % 1000 != 0) {
                        System.out.println("1000-n urjver oruulna nuu");    
                    } else {
                        cash = cash + add;
                        System.out.println(add + "$ hiiv");
                        System.out.println("Uldeglel: " + cash);
                    }
                    System.out.println("Dahin uildel hiihuu? (1-Tiim / 4- garah)");
                    check = sc.nextInt();
                    while (check != 1 && check != 4) {
                        System.out.println("please enter 1-Tiim or 4-garah");
                        check = sc.nextInt();
                        if (check == 1) {
                            running = true;
                        } else if (check == 4){
                            running = false;
                        }
                    }
                    break;
                default:
                    break;
            }  
        }
        System.out.println("bayarlla! ayulgui yvaarai");
        sc.close();
    }
}
