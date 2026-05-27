package month03.week01.day01.backend;

public class Student extends Person {
    String major;
    double gpa;

    Student(String name, int age, String major, double gpa){
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }
    
    @Override
    void introduce() {
        super.introduce();
        System.out.printf(" %s mergejilten, GPA: %.1f%n", major, gpa);
    }
    boolean isHonors() {
       return gpa >= 3.5;
    }
}
