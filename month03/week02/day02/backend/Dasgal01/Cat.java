package month03.week02.day02.backend.Dasgal01;

public class Cat extends Animals{
    
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    @Override
    public void getType() {
        System.out.println("Type: Cat");
    }
}
