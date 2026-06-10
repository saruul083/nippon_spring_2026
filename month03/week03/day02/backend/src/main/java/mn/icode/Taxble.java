package mn.icode;

public interface Taxble {
	double taxRate();
	default double taxAmount(double price) {
		return price * taxRate();
	}
	default double priceWithTax(double price) {
		return price + taxAmount(price);
	}
}
