package month02.week03.day01;

public class Exercises04 {

    static boolean isLeapYear(int year){
        return year % 100 != 0 || year % 400 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
    }
}
