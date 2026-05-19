package month02.week04.day02.backend;

public class JavaDasgal03 {
    public static void main(String[] args) {
    
    Student s1 = new Student("Saruulbilegt", new int[]{90, 80, 70, 60, 50});
    Student s2 = new Student("Uchralbilegt", new int[]{65, 75, 85, 95, 100});
    Student s3 = new Student("Erdembilegt", new int[]{100, 100, 100, 100, 100});
    
    s1.showReport();
    if (s1.average() >= s2.average() && s1.average() >= s3.average()) {
        System.out.println("Highest gpa student is " + s1.name + "with" + s1.gpa());
    } else if (s2.average() >= s1.average() && s2.average() >= s3.average()){
        System.out.println("Highest gpa student is " + s2.name + " with " + s2.gpa());
    } else {
        System.out.println("Highest gpa student is " + s3.name + " with " + s3.gpa());
    }
    }
}
