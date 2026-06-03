package month03.week02.day02.backend.Dasgal03;

public class Train extends Trasnport{
    
    Train(String name, int fuelLevel) {
        super(name, fuelLevel);
    }
    @Override
    int speed() {
        return 200;
    }
    @Override
    String fuelType() {
        return "Electric";
    }
}
