package month03.week01.day05.backend;

public class Animal {
    String name;
    int age;
    double weight;
    boolean isHealthy;
    Animal(String name, int age, double weight, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isHealthy = true;
    }

    void eat(String food) {
        System.out.println(name + " [" + food + "] idej bna");
    }
    void sleep() {
        System.out.println(name + " untaj bna");
    }
    void sound() {
        System.out.println(name + ": ...");
    }
    void checkup() {
        System.out.println(name + "-iin eruul mend: " + (isHealthy ? "eruul" : "Anhaaruulga"));
    }
    void showProfile() {
        System.out.println(name + " nertai " +  getType() + ", " + age + " hastai, " + weight + " kg jintai, " + (isHealthy ? "eruul" : "eruul bish"));
    }
    String getType() {
        return "Animal";
    }
}
