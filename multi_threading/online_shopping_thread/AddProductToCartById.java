package multi_threading.online_shopping_thread;

import java.util.ArrayList;
import java.util.Scanner;

public class AddProductToCartById {
public void addProductToCartById() {
	
	
	ArrayList<ProductDetail> product=GetProductList.getProductList();
	boolean flag=true;
	boolean idFound=false;
	do {
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	for(ProductDetail pd:product) {
	if(id==pd.productId)
	}
	}while(flag);
	
 }
}
