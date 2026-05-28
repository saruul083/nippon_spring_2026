package month03.week01.day05.backend;

public class Lion extends Animal{
    double maneLength;

    Lion(String name, int age, double weight, boolean isHealthy, double maneLength) {
        super(name, age, weight, isHealthy);
        this.maneLength = maneLength;
    }

    @Override
    void sound() {
        System.out.println(name + ": Aarr!!" );
    }

    @Override
    String getType() {
        return "Arslan";
    }
    void hunt() {
        System.out.println(name + " an hiij bna");
    }
}
