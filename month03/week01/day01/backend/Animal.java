package month03.week01.day01.backend;

public class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " hool idej bna");
    }
    void sleep() {
        System.out.println(name + " untaj bna");
    }
    void showInfo() {
        System.out.println(name + " (" + age + " nas)");
    }
}