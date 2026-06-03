package month03.week02.day01.backend;

public abstract class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double bonus();
    abstract String getRole();
    
    public double totalPay() {
        return baseSalary + bonus();
    }

    public void showPayLips() {
        System.out.println("Name: " + name);
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Bonus salary: " + bonus());
        System.out.println("Role: " + getRole());
    }
}
