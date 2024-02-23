package ProductPayment;

public class Payment {
	
	//pay by cash
	public String pay(double price) {
		return ("Thank you for pay by cash");
		
	}
	
	//pay by Credit card
	public String pay(double price, String cc_no) {
		return ("Thank you for pay by credit card"+cc_no);
		
	}
	
	//pay by Promptpay
	public String pay(double price, String pp_no, String bank) {
		return ("Thank you for pay by Promptpay"+pp_no);
	}

}
