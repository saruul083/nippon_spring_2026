package month03.week02.day02.backend.Dasgal01;

public class Parrot extends Animals{
    boolean canTalk;

    Parrot(String name, int age, boolean canTalk) {
        super(name, age);
        this.canTalk = canTalk;
    }

    @Override
    public void sound() {
        System.out.println((canTalk ? "Hello human" : "Squawk!"));
    }

    @Override
    public void getType() {
        System.out.println("Type: Parrot");
    }
}
