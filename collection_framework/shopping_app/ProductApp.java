package collection_framework.shopping_app;

import java.util.HashSet;
import java.util.Set;

public class ProductApp {
	
	public static void main(String[] args) {
		Product p1=new Product(1,"pendridsFve",399.0);
		Product p2=new Product(2,"pendrive",3499.0);
		Product p3=new Product(3,"pendrdsfdsaive",3939.0);
		Product p4=new Product(4,"pendsadfrive",3939.0);
		Product p5=new Product(5,"pendadsfrive",32199.0);
		Set<Product> s=new HashSet<Product>();
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		s.add(p5);
	    Cart.addProductById(s,4);
	    Cart.addProductById(s,2);
	    System.out.println(Cart.s);
	    System.out.println("Size of cart :"+Cart.s.size());
		
	}
}
