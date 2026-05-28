package month03.week01.day05.backend.Nemelt_Java.L1_1;

public class Vechile {
    String brand;
    int speed;

    Vechile(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void move() {
        System.out.println(brand + " " + speed + " hurdtai ybj bna");
    }
    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}
