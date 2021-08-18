package multi_threading.online_shopping_thread;

public class ShoppingApp{
	

	public static void main(String[] args) {
		System.out.println("List Of Product is Listed Below");
		GetProductList gp=new GetProductList();
		gp.start();
	    

	}

}
