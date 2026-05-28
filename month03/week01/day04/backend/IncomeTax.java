package month03.week01.day04.backend;

public class IncomeTax extends TaxCalculator {
    
    IncomeTax(double income) {
        super(income);
    }

    @Override
    double calculate() {
        if (income <= 1000000) {
            return income * 0.1;
        } else if (income <= 3000000) {
            return income * 0.15;
        } else {
            return income * 0.2;
        }
    }
}
