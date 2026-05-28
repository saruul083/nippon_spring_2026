package month03.week01.day04.backend;

public class VATCalculator extends TaxCalculator{
    
    VATCalculator(double income) {
        super(income);
    }

    @Override
    double calculate() {
        return income * 0.1;
    }
}
