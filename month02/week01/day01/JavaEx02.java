package month02.week01.day01;

public class JavaEx02 {
    public static void main(String[] args) {
        int score = 85;
        if (score == 100) {                     // ← алдаа
            System.out.println("Төгс оноо!");
        }

        // Алдаа 2: Логикийн алдаа
        int age = 25;
        if (age > 18 && age < 60) {            // ← алдаа (&&байх ёстой)
            System.out.println("Ажлын насны хүн");
        }

        // Алдаа 3: switch break алдаа
        int day = 2;
        switch (day) {
            case 1: System.out.println("Нэг"); break;
            case 2: System.out.println("Хоёр"); break;  // ← break дутуу
            case 3: System.out.println("Гурав"); break;
        }

        // Алдаа 4: Хүрэх боломжгүй код
        int x = 50;
        if (x > 10) {
            System.out.println("10-aas их");
        } else if (x > 30) {                    // ← хэзээ ч ажиллахгүй
            System.out.println("30-aas их"); 
        } else if (x >= 50) {
            System.out.println("50-aas ih boyo tentsuu");
        }
    }
}
