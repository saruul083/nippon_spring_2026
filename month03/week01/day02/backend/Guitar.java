package month03.week01.day02.backend;

public class Guitar extends StringInstrument{
    boolean isElectric;

    Guitar(String brand, boolean isElectric) {
        super("Guitar", brand, 6);
        this.isElectric = isElectric;
    }
    @Override
    void play() {
        if (isElectric) {
            System.out.println(brand + " tsahilgaan guitar: CHAANG!");
        } else {
            System.out.println(brand + "Acuuustic guitar: traling~");
        }
    }
}
