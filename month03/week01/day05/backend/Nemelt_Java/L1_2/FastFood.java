package month03.week01.day05.backend.Nemelt_Java.L1_2;

public class FastFood extends Food{
    String size;

    FastFood(String name, int calories, String size) {
        super(name, calories);
        this.size = size;
    }

    @Override
    boolean isHealthy() {
        if (calories < 400) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    void describe() {
        System.out.println("Hurdan hool: " + name + "[" + size + "], " + calories + " kkal, Eruul:" + isHealthy());
    }
}
