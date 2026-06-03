package month03.week02.day02.backend.Dasgal01;

public class Dog extends Animals{

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    @Override
    public void getType() {
        System.out.println("Type: Dog");
    }
}
