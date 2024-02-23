package Food_machine;


public class Drink extends Product {
    private String type;

    public Drink(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public String detail(){
        return "Product Name: " + this.name + " Product Price: " + this.price + " Product type: " + this.type;
    }
}