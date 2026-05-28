package month03.week01.day05.backend.Nemelt_Java.L1_2;

public class Fruit extends Food{
    boolean isOragnic;

    Fruit(String name, int calories, boolean isOragnic) {
        super(name, calories);
        this.isOragnic = isOragnic;
    }

    @Override
    boolean isHealthy() {
        return true;
    }

    @Override
    void describe() {
        System.out.println("Jims: " + name + " " + (isOragnic ? "Oragnic, " : "erdiin, ") + calories + " kkal, Eruul hool");
    }
}
