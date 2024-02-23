package HomeWorkPackage;

public class Drink extends Product {
	public String type;
	
	//constructor with data
	public Drink(String name, double price, String type) {
		super(name, price);
		this.type = type;
	}
	
	public String showDetail() {
		return "Product Name: " + name + " Price: " + price + " Type: " + type;
	}
	
}