package HomeWorkPackage;

public class Product {
	
	public String name;
	public double price;
	
	//default constructor		
	public Product() {
		this("",0.0);
	}
	
	//constructor with data	
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void onSale() {
		System.out.println("Thank you");
	}
	
	public String showDetail() {
		return "Product Name: " + name + " Price: " + price;
	}

}
