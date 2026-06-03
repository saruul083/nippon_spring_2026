package month03.week02.day01.backend;

public class FullTimeEmployee extends Employee{
    
    FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    double bonus() {
        return baseSalary * 0.20;
    }

    @Override
    String getRole() {
        return "Full-time";
    }
}