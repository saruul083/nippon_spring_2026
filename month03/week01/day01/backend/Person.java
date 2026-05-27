package month03.week01.day01.backend;

public class Person {
    String name;
    int age;
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Bi " + name + ", " + age + " hastai");
    }
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
