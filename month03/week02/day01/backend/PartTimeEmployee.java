package month03.week02.day01.backend;

public class PartTimeEmployee extends Employee{
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double bonus() {
        return 0;
    }

    @Override
    String getRole() {
        return "Part-time";
    }

    @Override
    public double totalPay() {
        return hoursWorked * hourlyRate;
    }
}
