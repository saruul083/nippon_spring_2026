package month03.week01.day04.backend;

public class Train extends Transport {
    int carriages;
    
    Train(String name, int speed, int capacity, int carriages) {
        super(name, speed, capacity);
        this.carriages = carriages;
    }

    @Override
    void move() {
        System.out.println(name + " galt tereg (" + carriages + " vagon) hudulluu");
    }
}
