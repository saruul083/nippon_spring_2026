package mn.icode;

public class Product implements Comparable<Product>{
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Product other) {
		return Double.compare(other.price, this.price);
	}
	@Override
	public String toString() {
		return name + " (" + price + ")";
	}
	
}
