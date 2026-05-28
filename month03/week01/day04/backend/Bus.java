package month03.week01.day04.backend;

public class Bus extends Transport{
    int routeNumber;

    Bus(String name, int speed, int capacity, int routeNumber) {
        super(name, speed, capacity);
        this.routeNumber = routeNumber;
    }

    @Override
    void move() {
        System.out.println(name + " abtobus (marshroute " + routeNumber + ") hudulluu" );
    }
}
