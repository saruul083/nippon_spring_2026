package month03.week02.day02.backend.Dasgal02;

public class Main {
    public static void main(String[] args) {
        Weapon[] myWeapons = {
            new Sword("Excalibur", 100, 6),
            new Sword("Rusty Sword", 0, 3),
            new Bow("Shooting star", 30, 2),
            new Staff("Fire wand", 50, 5)
        };

        for(Weapon w: myWeapons) {
            w.showStats();
        }

        myWeapons[0].attack("Dragon");
        myWeapons[1].attack("Dragon");
        myWeapons[2].attack("Orc");
        myWeapons[2].attack("Orc");
        myWeapons[2].attack("Orc");
    }
}
