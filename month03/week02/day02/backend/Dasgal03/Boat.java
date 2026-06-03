package month03.week02.day02.backend.Dasgal03;

public class Boat extends Trasnport{
    
    Boat(String name, int fuelLevel) {
        super(name, fuelLevel);
    }

    @Override
    int speed() {
        return 40;
    }

    @Override
    String fuelType() {
        return "Diesel";
    }
}
