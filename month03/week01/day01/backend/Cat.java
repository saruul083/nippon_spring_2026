package month03.week01.day01.backend;

public class Cat extends Animal {
    boolean isIndoor;

    Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    void purr() {
        System.out.println(name + ": prrrr");
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(" Geriin muur: " + (isIndoor ? "Tiim" : "Ugui"));
    }
}
