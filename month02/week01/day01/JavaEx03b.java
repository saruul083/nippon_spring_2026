package month02.week01.day01;

public class JavaEx03b {
    public static void main(String[] args) {
        int age = 2;
        if (age > 64) {
            System.out.println("akhmad");
        } else if (age <= 64 && age > 17) {
            System.out.println("Nasand khursen");
        } else if (age <= 17 && age > 12) {
            System.out.println("Usver nas");
        } else if (age <= 12 && age > 2) {
            System.out.println("khuukhed");
        } else if (age <= 2) {
            System.out.println("Nyalkh");
        }
    }
}
