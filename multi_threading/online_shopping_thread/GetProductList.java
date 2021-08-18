package multi_threading.online_shopping_thread;

import java.util.*;


public class GetProductList extends Thread{
	public static ArrayList<ProductDetail> getProductList() {
		ArrayList<ProductDetail>pd=new ArrayList<ProductDetail>();
		pd.add(new ProductDetail(1,"data transfer cable",299));
		pd.add(new ProductDetail(2,"ssd 500Gb",4999));
		pd.add(new ProductDetail(3,"hdd 1Tb",2999));
		pd.add(new ProductDetail(4,"pendrive 8Gb",340));
		pd.add(new ProductDetail(5,"Card Reader",149));
		pd.add(new ProductDetail(6,"Router",1199));
		
		return pd;
	
	}
	public void run() {
		System.out.println(GetProductList.getProductList());
	}
}
