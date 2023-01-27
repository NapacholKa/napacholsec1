
public class testCustomer {
	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		System.out.println(c1.toString());// Customer's toString()
		c1.setDiscount(5);// set customer's discount is 5
		System.out.println(c1.toString());// Customer's toString()
		Line();
		System.out.println("id is: "+c1.getID());// show customer's id
		System.out.println("Name is: "+c1.getName());// show customer's name
		System.out.println("discount is: "+c1.getDiscount());// show customer's discount
		Line();
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
		System.out.println(inv1.toString());// Invoice's toString()
		inv1.setAmount(10000);// set invoice's amount is 10000
		System.out.println(inv1.toString());// Invoice's toString()
		Line();
		System.out.println("id is: "+inv1.getID());// show invoice's id
		System.out.println("customer is: "+c1.toString());// Customer's toString() by instance inv1
		System.out.println("amount is: "+inv1.getAmount());// show invoice's amount
		Line();
		System.out.println("customer's id is: "+inv1.getCustomerID());// show customer's id by instance inv1
		System.out.println("customer's name is: "+inv1.getCustomerName());// show customer's name by instance inv1
		System.out.println("customer's discount is: "+inv1.getCustomerDiscount()); // show customer's discount by instance inv1
		System.out.printf("customer after discount is: "+"%.2f",inv1.getAmountAfterDiscount());// show invoice's amount after discount(format as output)
		} // end of main method()

	public static void Line() {
		int y = 100;
		for (int i = 1; i <= y; i++) {
			System.out.print("*");
		}
		System.out.println();
		// use for() statement to display symbol *
	}
} // end of class()


