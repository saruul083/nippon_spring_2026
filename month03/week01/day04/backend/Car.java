package month03.week01.day04.backend;

public class Car extends Transport{
    String fuel;

    Car(String name, int speed, int capacity, String fuel) {
        super(name, speed, capacity);
        this.fuel = fuel;
    }
    @Override
    void move() {
        System.out.println(name + " mashin [" + fuel + "] ashiglan hudulluu");
    }
}
