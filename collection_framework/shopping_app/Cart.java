package collection_framework.shopping_app;
import java.util.*;
public class Cart {
static Set<Product>s=new HashSet<Product>();
public static void addtoCart(Product p) {
	s.add(p);
}
public static void addProductById(Set<Product> product,int id) {
	for(Product p: product) {
		if(id==p.id)
			addtoCart(p);

	}
	
}
}
