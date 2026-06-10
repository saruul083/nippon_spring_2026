package mn.icode;

public interface Discountable {
	double discountRate();
	default double discountAmount(double price) {
		return price * discountRate();
	}
	default double priceAfterDiscount(double price) {
		return price - discountAmount(price);
	}
}
