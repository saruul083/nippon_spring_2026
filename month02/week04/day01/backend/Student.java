
public class Student {
    int age;
    String name;
    double gpa;

    public Student(int age, String name, double gpa){
        this.age = age;
        this.name = name;
        this.gpa = gpa;
    }

    void printHello(){
        System.out.println("Hello Student");
    }
    void introduceMyself(){
        System.out.println("My name is " + name + " and I'm " + age + " years old");
        System.out.println("I have a grade of " + gpa);
    }
    String nextYear(){
        return "Next year i will be " + (age - 5) + " Grade Student";
    }
}
