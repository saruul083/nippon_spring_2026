package month03.week01.day02.backend;

public class WindInstrument extends Instrument {
    String material;

    WindInstrument(String name, String brand, String material) {
        super(name, brand);
        this.material = material;
    }

    @Override
    void play() {
        System.out.println(brand + " " + name + " [" + material + "]: du-u-u-u");
    }
}
