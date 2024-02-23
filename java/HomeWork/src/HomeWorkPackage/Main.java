package HomeWorkPackage;
public class Main {
	public static void main (String args[]) {
		
		Machine m1 = new Machine();
		
		m1.addProduct(new Snack("doritos", 30.0, "babeq"));
		m1.addProduct(new Drink("coke", 30.0, "soda"));
			
		m1.showProductAll();

	}
}
