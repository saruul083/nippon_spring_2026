package month03.week01.day05.backend.Nemelt_Java.L1_1;

public class Plane extends Vechile{
    int altitude;

    Plane(String brand, int speed, int altitude) {
        super(brand, speed);
        this.altitude = altitude;
    }

    @Override
    void move() {
        System.out.println(brand + " ongots hisch bna (" + altitude + "m undurt)");
    }
}
