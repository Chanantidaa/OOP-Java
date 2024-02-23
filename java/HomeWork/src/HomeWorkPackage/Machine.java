package HomeWorkPackage;
import java.util.*;

public class Machine {
	
	private ArrayList<Product> productList;
	
	public Machine() {
		productList = new ArrayList<Product>();
	}
	
	public void showProductAll() {
		for (int i = 0; i<= productList.size()-1 ; i++) {
			 System.out.println(productList.get(i).showDetail());
		}
	}
	
	public void addProduct(Product p) {
		productList.add(p);
	}

}
