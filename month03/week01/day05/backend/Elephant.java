package month03.week01.day05.backend;

public class Elephant extends Animal{
    double trunkLength;

    Elephant(String name, int age, double weight, boolean isHealthy, double trunkLength) {
        super(name, age, weight, isHealthy);
        this.trunkLength = trunkLength;
    }

    @Override
    void sound() {
        System.out.println(name + ": Puuu!");
    }
    @Override
    String getType() {
        return "Zaan";
    }

    void spray() {
        System.out.println(name + " hoshuugaaraa us tsatsaj bna");
    }
}
