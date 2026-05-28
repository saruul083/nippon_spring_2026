package month03.week01.day02.backend;

public class StringInstrument extends Instrument{
    int strings;

    StringInstrument(String name, String brand, int strings) {
        super(name, brand);
        this.strings = strings;
    }

    @Override
    void play() {
        System.out.println(brand + " " + name + " (" + strings + "hogj): bring!");
    }
    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Strings: " + strings);
    }
}
