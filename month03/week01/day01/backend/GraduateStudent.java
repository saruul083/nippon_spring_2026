package month03.week01.day01.backend;

public class GraduateStudent extends Student {
    String thesisTopic;
    
    GraduateStudent(String name, int age, String major, double gpa, String thesisTopic) {
        super(name, age, major, gpa);
        this.thesisTopic = thesisTopic;
    }
    @Override
    void introduce() {
        super.introduce();
        System.out.println(" dissetrachi: " + thesisTopic);
    }
}
