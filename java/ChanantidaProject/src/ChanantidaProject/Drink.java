package ChanantidaProject;

public class Drink extends Product{
	public String type;
	public void showDetail() {
		System.out.println("Product Name : "+name);
		System.out.println("Price : "+price+" Baht");
		System.out.println("Type : "+type);
	}
}
