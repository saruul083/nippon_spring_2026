package month03.week02.day01.backend;

public class ContractEmployee extends Employee{
    double contractBonus;

    ContractEmployee(String name, double baseSalary, double contractBonus) {
        super(name, baseSalary);
        this.contractBonus = contractBonus;
    }

    @Override
    double bonus() {
        return contractBonus;
    }

    @Override
    String getRole() {
        return "Contract";
    }
}
