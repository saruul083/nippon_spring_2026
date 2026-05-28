package month03.week01.day05.backend.Nemelt_Java.L1_1;

public class Boat extends Vechile{
    boolean isMotor;
    Boat(String brand, int speed, boolean isMotor) {
        super(brand, speed);
        this.isMotor = isMotor;
    }
    @Override
    void move() {
        System.out.println(brand + " zavi usaar ybj bna");
    }
}
