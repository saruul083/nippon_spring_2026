package month03.week01.day01.backend;

public class Employee extends Person{
    String company;
    double salary;

    Employee(String name, int age, String company, double salary) {
        super(name, age);
        this.company = company;
        this.salary = salary;
    }
    void work() {
        System.out.println(company + " companid ajillaj bna");
    }
    void getSalary() {
        System.out.printf("%s-ийн цалин: %,.0f₮%n", name, salary);
    }
    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Comapny: " + company);
        System.out.printf("%s-ийн цалин: %,.0f₮%n", name, salary);
    }

    boolean earnsMore(Employee other) {
        return this.salary > other.salary;
    }
}
