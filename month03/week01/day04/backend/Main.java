package month03.week01.day04.backend;

public class Main {
    public static void main(String[] args) {
        Transport[] fleet = {
            new Car("Toyota", 50, 5, "Euro 94"),
            new Bus("CH: 14", 30, 25, 4),
            new Train("Yamanote", 240, 500, 9),
            new Car("Tesla", 100, 5, "HyperEuro 98"),
            new Bus("CH: 34", 40, 30, 5)
        };

        System.out.println("=== Teeveriin heregsliin medeelel === ");
        for (Transport t : fleet) t.showInfo();

        System.out.println("\n=== Hudulj bna ===");
        for (Transport t : fleet) t.move();

        System.out.println("\n=== 100 aylah hugatsaa (tsag) ===");
        for (Transport t : fleet) {
            System.out.printf("%-15s: %d tsag%n", t.name, t.tripTime(100));
        }

        Transport fastest = fleet[0];
        for (Transport t : fleet) if (t.speed > fastest.speed) fastest = t;
        System.out.println("\nHamgiin hurdan: " + fastest.name + " (" + fastest.speed + " km/ts)");
    }   
}
