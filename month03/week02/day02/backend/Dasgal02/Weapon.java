package month03.week02.day02.backend.Dasgal02;

public abstract class Weapon {
    String name;
    int durability;

    public Weapon(String name, int durability) {
        this.name = name;
        this.durability = 100;
    }

    abstract int damage();
    abstract String getType();

    void attack(String enemy) {
        if (isBroken()) {
            System.out.println(name + " is broken! Repair it first!");

            return;
        }
        durability = durability - 5;
        System.out.println(name + " attacks enemy for " + damage() + " damage! Durability: " + durability);
    }

    boolean isBroken() {
        if(durability <= 0) return true;
        return false;
    }

    void repair() {
        System.out.println("Durability is fixed to 100");
        durability = 100;
    }

    void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Durability: " + durability);
        System.out.println("Damage: " + damage());
        System.out.println((isBroken() ? "This weapon is broken" : "This sword is not broken"));
    }
}
