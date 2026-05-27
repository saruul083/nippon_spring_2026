package month03.week01.day01.backend;

class Vechile {
    String brand;
    int year;

    Vechile(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start() {
        System.out.println(brand + " ehellee");
    }
    void showInfo() {
        System.out.println(brand + " (" + year + ")");
    }
}

class Car extends Vechile {
    int doors;

    Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    void honk() {
        System.out.println(brand + ": Beep Beep");
    }

    @Override
    void showInfo() {
        System.out.println(" haalga: " + doors);
    }
}

class ElectricCar extends Car {
    int batteryKwh;

    ElectricCar(String brand, int year, int doors, int batteryKwh) {
        super(brand, year, doors);
        this.batteryKwh = batteryKwh;
    }

    void charge() {
        System.out.println(brand + " chenegelej bnaa...(" + batteryKwh + " kwh)");
    }

    @Override
    void start() {
        System.out.println(brand + " chimeeguihen ehellee (Chahilgaan).");
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(" Battery: " + batteryKwh + " kWh");
    }
}




public class Inheritance {
    public static void main(String[] args) {
        // Dog dog = new Dog("Sharga", 3, "labrador");
        // Cat cat = new Cat("Myu", 2, true);

        // dog.eat();
        // dog.bark();
        // dog.showInfo();

        // cat.sleep();
        // cat.purr();
        // cat.showInfo();

        // ElectricCar tesla = new ElectricCar("Tesla", 2023, 4, 100);
        // tesla.start();
        // tesla.honk();
        // tesla.charge();
        // tesla.showInfo();

        // Student s1 = new Student("Javkha", 23, "himi", 3.15);
        // Student s2 = new Student("Davga", 25, "Architect", 4.15);
        // GraduateStudent s3 = new GraduateStudent("Fizin", 22, "fizik", 4.51, "what");

        // s1.introduce();
        // System.out.println("Honors: " + s1.isHonors());
        // System.out.println();
        // s2.introduce();
        // System.out.println("Honors: " + s2.isHonors());
        // System.out.println();
        // s3.introduce();
        // System.out.println("Honors: " + s3.isHonors());

        Employee e1 = new Employee("Батаа", 28, "iCode", 2_500_000);
        Employee e2 = new Employee("Сарнай", 25, "TechCo", 2_000_000);
        Manager m1  = new Manager("Дорж", 35, "iCode", 4_000_000, 8);

        e1.introduce();
        e1.work();
        e1.getSalary();
        e1.showInfo();
        System.out.println();

        m1.showInfo();
        m1.manage();
        System.out.println();

        System.out.println("e1 e2-оос их цалинтай? " + e1.earnsMore(e2));
        System.out.println("e2 m1-ээс их цалинтай? " + e2.earnsMore(m1));
    }
}
