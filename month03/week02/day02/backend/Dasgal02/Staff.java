package month03.week02.day02.backend.Dasgal02;

public class Staff extends Weapon{
    int magicPower;

    Staff(String name, int durability, int magicPower) {
        super(name, durability);
        this.magicPower = magicPower;
    }

    @Override
    int damage() {
        return magicPower * 3;
    }

    @Override
    String getType() {
        return "Magic staff";
    }
}
