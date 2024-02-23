package Food_machine;
public class Snack extends Product {
    private String flavour;

    public Snack(String name, double price, String flavour) {
        super(name, price);
        this.flavour = flavour;
    }

    @Override
    public String detail(){
        return "Product Name: " + this.name + " Product Price: " + this.price + " Product Flavour: " + this.flavour;
    }
}