package exceptionhandling.productexception;


//get list ,add products to cart ,verify the cart,payment method,confirmation of payment ,print the recipt
class PrintStatus{
	public static void printStatus(String str) {
		try {
			Thread.sleep(0);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
	}
}
class GetList extends Thread{
	public  static String getProductList() {
		return "productList...";
	}
	public void run() {
		
		//PrintStatus.printStatus(getProductList());
		PrintStatus.printStatus("productList...");
		
	}
}
class AddProduct extends Thread{
	public  static String addProduct() {
		return "Product added...";
	}
	public void run() {
		
		//PrintStatus.printStatus(addProduct());
		PrintStatus.printStatus("Product added...");
		
	}
}
class Verifycart extends Thread{
	public  static String verifyCart() {
		return "Cart Verified..";
	}
	public void run() {
		
		//PrintStatus.printStatus(verifyCart());
		PrintStatus.printStatus("Cart Verified..");
	}
}
class Payment extends Thread{
	public   static String payment() {
	return "payment Ongoing...";
	}
	public void run() {

	//	PrintStatus.printStatus(payment());
		PrintStatus.printStatus("payment Ongoing...");
	}
}
class PaymentConfirmation extends Thread{
	public  static String paymentconfirmation() {
		return "Payment Confirmed...";
	}
	public void run() {
		
		//PrintStatus.printStatus(paymentconfirmation());
		PrintStatus.printStatus("Payment Confirmed...");
	}
}
class PaymentRecipt extends Thread{
	public  static String paymentRecipt() {
		return "Payment Recipt...";
	}
	public void run() {
		
		//PrintStatus.printStatus(paymentRecipt());
		PrintStatus.printStatus("Payment Recipt...");
	}
}
public class None{
public static void main(String[] args) throws InterruptedException {
	GetList g=new GetList();
	AddProduct ap=new AddProduct();
	Verifycart vp=new Verifycart();
	Payment p=new Payment();
	PaymentConfirmation pc=new PaymentConfirmation();
	PaymentRecipt pr=new PaymentRecipt();
	g.start();
	g.setName("GetListThread");
//	System.out.println("thread name"+g.getName());
//	System.out.println("priority of get list "+g.getPriority());
	g.setPriority(10);
//	g.join();
	ap.start();
	ap.setPriority(9);
//	ap.join();
	vp.start();
	vp.setPriority(8);
//	vp.join();
	p.start();
	p.setPriority(7);
//	p.join();
	pc.start();
	pc.setPriority(6);
//	pc.join();
	pr.start();
	pr.setPriority(5);
//  pr.join();
	
}
}