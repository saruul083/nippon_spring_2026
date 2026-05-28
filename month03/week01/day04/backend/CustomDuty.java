package month03.week01.day04.backend;

public class CustomDuty extends TaxCalculator{
    double rate;
    
    CustomDuty(double income, double rate) {
        super(income);
        this.rate = rate;
    }

    @Override
    double calculate() {
        return income * rate;
    }
}
