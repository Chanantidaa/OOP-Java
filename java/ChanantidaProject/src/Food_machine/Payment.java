package Food_machine;
public class Payment {
    public void payByCash(double price) {
        System.out.println("Thank you for pay by cash");
    }

    public void payByCreditCard(double price, String cc_no){
        System.out.println("Thank you for pay by credit card"+cc_no);
    }

    public void payByPromptPay(double price, String pp_no, String bank) {
        System.out.println("Thank you for pay by Promptpay"+pp_no);
    }
}
