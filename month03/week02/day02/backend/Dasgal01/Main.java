package month03.week02.day02.backend.Dasgal01;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
            new Dog("Wanko", 3),
            new Cat("Nyanko", 2),
            new Parrot("Peroko", 2, true),
            new Parrot("Pechiko", 3, false)
        };

        for(Animals a : animals) {
            a.showInfo();
            System.out.println();
        }
    }
}
