package Food_machine;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Machine m = new Machine();
        Cart c = new Cart();
        Payment p = new Payment();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            m.displayMenu();
            int choice = scanner.nextInt();
            System.out.println("-------------------------------");
            switch (choice) {
                case 1:
                    System.out.println("This all product");
                    ArrayList<Product> allProduct = m.getAllProduct();
                    for(Product item: allProduct){
                        System.out.println(item.detail());
                    }
                    System.out.println("-------------------------------");
                    break;

                case 2:
                    System.out.println("Fill the name of product");
                    String itemName = scanner.next();
                    c.addItemToCart(itemName, m);
                    System.out.println("-------------------------------");
                    break;

                case 3:
                    System.out.println("This is all product in cart");
                    ArrayList<Product> itemsInCart = c.getItemsInCart();
                    for(Product item : itemsInCart){
                        System.out.println(item.detail());
                    }
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    System.out.println("Select Type of Payment");
                    System.out.println("1. Cash");
                    System.out.println("2. Credit Card");
                    System.out.println("3. Prompt Pay");
                    System.out.println("4. Cancel");
                    System.out.print("Select an option: ");
                    int paymentType = scanner.nextInt();
                    double total = c.checkout();
                    switch (paymentType){
                        case 1:
                            p.payByCash(total);
                            System.out.println("-------------------------------");
                            c.clear();
                            break;
                        case 2:
                            System.out.println("Card id: ");
                            String cardId = scanner.next();
                            p.payByCreditCard(total, cardId);
                            System.out.println("-------------------------------");
                            c.clear();
                            break;
                        case 3:
                            System.out.println("Prompt id: ");
                            String bankName = scanner.next();
                            System.out.println("Bank name: ");
                            String pp_no = scanner.next();
                            p.payByPromptPay(total, pp_no ,bankName);
                            System.out.println("-------------------------------");
                            c.clear();
                            break;
                        case 4:
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}