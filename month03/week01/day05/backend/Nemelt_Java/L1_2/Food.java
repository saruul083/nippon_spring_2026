package month03.week01.day05.backend.Nemelt_Java.L1_2;

public class Food {
    String name;
    int calories;

    Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    void describe() {
        System.out.println("This food [" + name + "] has " + calories + " calories in it");
    }

    boolean isHealthy() {
        if (calories > 60) return false;
        else return true;
    }
}
