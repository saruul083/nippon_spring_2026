package month03.week01.day05.backend;

public class Penguin extends Animal{
    boolean canFly = false;

    Penguin(String name, int age, double weight, boolean isHealthy, boolean canFly) {
        super(name, age, weight, isHealthy);
        this.canFly = canFly;
    }
    @Override
    void sound() {
        System.out.println(name + ": Haaa Haaa!");
    }
    @Override
    String getType() {
        return "Penguin";
    }
    void swim() {
        System.out.println(name + " usand selj bna");
    }
}
