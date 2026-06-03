package month03.week02.day02.backend.Dasgal03;

public class Car extends Trasnport{
    
    Car(String name, int fuelLevel) {
        super(name, fuelLevel);
    }
    @Override
    int speed() {
        return 120;
    }
    @Override
    String fuelType() {
        return "Gasoline";
    }
}
