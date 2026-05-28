package month03.week01.day04.backend;

public class Transport {
    String name;
    int speed;
    int capacity;

    Transport(String name, int speed, int capacity) {
        this.name = name;
        this.speed = speed;
        this.capacity = capacity;
    }

    void move() { System.out.println(name + " hudulloo");}
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
        System.out.println("Capacity: " + capacity);
    }
    int tripTime(int distance) {
        return distance / speed;
    }
}
