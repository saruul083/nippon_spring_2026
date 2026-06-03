package month03.week02.day02.backend.Dasgal03;

public abstract class Trasnport {
    String name;
    int fuelLevel;

    Trasnport(String name, int fuelLevel) {
        this.name = name;
        this.fuelLevel = fuelLevel;
    }

    abstract int speed();
    abstract String fuelType();

    void refuel(int amount) {
        System.out.println("Refueling by " + amount);
        fuelLevel = Math.min(100, fuelLevel + amount);
        System.out.println("Refueled to " + fuelLevel);
    }

    boolean canMove() {
        if (fuelLevel >0) return true;
        return false;
    }

    void move(int km) {
        if (!canMove()) {
            System.out.println(name + " has no fuel!");
            return;
        }
        int burn = Math.max(1, km / speed());
        fuelLevel = Math.max(0, fuelLevel = burn);
        System.out.printf("Moved by %d used %d fuel. Remaining fuel: %d%n", km, burn, fuelLevel);
    }

    void showStats() {
        System.out.printf("[%s] speed: %d km/h | fuel: %s  %d%n", name, speed(), fuelType(), fuelLevel );

    }
}
