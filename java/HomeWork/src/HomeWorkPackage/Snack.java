package HomeWorkPackage;

public class Snack extends Product {
	public String flavour;
	
	//constructor with data
	public Snack(String name, double price, String flavour) {
		super(name, price);
		this.flavour = flavour;
	}
	
	
	public String showDetail() {
		return "Product Name: " + name + " Price: " + price + " Flavour: " + flavour;
	}
}
