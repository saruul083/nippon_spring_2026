package month03.week01.day05.backend;

public class Giraffe extends Animal{
    double neckLength;

    Giraffe(String name, int age, double weight, boolean isHealthy, double neckLength) {
        super(name, age, weight, isHealthy);
        this.neckLength = neckLength;
    }

    @Override
    void sound() {
        super.sound();
    }
    
    @Override
    String getType() {
        return "Giraffe";
    }

    void eatLeaves() {
        System.out.println(name + " undur modnii nabch idej bna");
    }
}
