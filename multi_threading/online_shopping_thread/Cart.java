package multi_threading.online_shopping_thread;

import java.util.ArrayList;

public class Cart {
public static ArrayList<ProductDetail>cart=new ArrayList<ProductDetail>();
public static void addToCart(ProductDetail p) {
	cart.add(p);
} 
}
