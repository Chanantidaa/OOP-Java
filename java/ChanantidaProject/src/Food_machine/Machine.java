package Food_machine;
import java.util.ArrayList;

public class Machine {
    private final ArrayList<Product> productList = new ArrayList<Product>();

    public Machine() {
        this.productList.add(new Drink("coke", 30.0, "soda"));
        this.productList.add(new Snack("lays", 30.0, "salt"));
    }

    public void displayMenu() {
        System.out.println("Welcome to the Food Vending Machine.");
        System.out.println("1. Show all product");
        System.out.println("2. Add product to cart");
        System.out.println("3. Show Items in Product");
        System.out.println("4. Checkout");
        System.out.println("5. Exit");
        System.out.print("Select an option: ");
    }


    public ArrayList<Product> getAllProduct(){
        if(productList.isEmpty()){
            System.out.println("Not have a Products this now.");
        }
        return productList;
    }
}
