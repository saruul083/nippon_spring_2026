package mn.icode;

public class PremiumProduct implements Taxble, Discountable{
	private String name;
	private double basePrice;
	
	public PremiumProduct(String name, double basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}
	@Override
	public double discountRate() {
		return 0.15;
	}

	@Override
	public double taxRate() {
		return 0.10;
	}
	
	public double finalPrice() {
		return priceAfterDiscount(basePrice) + taxAmount(basePrice);
	}
	
	void showPricing() {
		System.out.printf("Tax rate = %d, Taxed amount = %d, After taxed price = %d", taxRate(), taxAmount(basePrice), priceWithTax(basePrice));
		System.out.println("------");
		System.out.printf("Discout rate = %d, Discount amount = %d, After discounted price = %d", discountRate(), discountAmount(basePrice), priceAfterDiscount(basePrice));
		System.out.println("------");
		System.out.printf("This $s has %d (Final Price)$ = %d (Price with tax) + %d (Price with Discounted)",name, finalPrice(), priceWithTax(basePrice), priceAfterDiscount(basePrice));
	}
	
}
