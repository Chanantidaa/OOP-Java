package Food_machine;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<Product> itemsCart = new ArrayList<Product>();

    public void addItemToCart(String name, Machine m) {
        for(Product item : m.getAllProduct()){
            if(name.equals(item.getName())){
                this.itemsCart.add(item);
                System.out.println("Add item Successfully.");
            }
        }
    }

    public ArrayList<Product> getItemsInCart(){
        return this.itemsCart;
    }

    public double checkout() {
        double total = 0.0;
        for (Product item : itemsCart) {
            total = total + item.getPrice() ;
        }
        return total;
    }

    public void clear() {
        itemsCart.clear();
    }
}