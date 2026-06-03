package month03.week02.day02.backend.Dasgal01;

public abstract class Animals {
    String name;
    int age;
    
    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sound();
    public abstract void getType();

    public void breathe() {
        System.out.println(name + " is breathing");
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        getType();
        System.out.println("Age: " + age);
        sound();
    }
}
