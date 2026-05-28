package month03.week01.day02.backend;

public class Instrument {
    String name;
    String brand;

    Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    void play() {
        System.out.println(brand + " " + name + " togloj bna");
    }
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Brand: "  + brand);
    }
}
