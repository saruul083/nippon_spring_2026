package month03.week01.day05.backend.Nemelt_Java.L1_2;

public class Vegetable extends Food{
    
    Vegetable(String name, int calories) {
        super(name, calories);
    }
    @Override
    boolean isHealthy() {
        return true;
    }

    @Override
    void describe() {
        System.out.println("hunsnii nogoo: " + name + ", " + calories + " kkal, Eruul: " +isHealthy());
    }
}
