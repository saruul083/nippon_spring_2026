package month03.week01.day01.backend;

public class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + ": hab hab!");
    }
    void fetch() {
        System.out.println(name + " shidsen zuiliig avchirna");
    }
    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(" uildver: " + breed);
    }
}
