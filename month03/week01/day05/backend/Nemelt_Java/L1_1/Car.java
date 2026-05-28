package month03.week01.day05.backend.Nemelt_Java.L1_1;

public class Car extends Vechile{
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    void move() {
        System.out.println(brand + " mashin zamaar ybj bna");
    }
}
