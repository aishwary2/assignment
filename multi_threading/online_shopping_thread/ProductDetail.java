package multi_threading.online_shopping_thread;



public class ProductDetail {
	String productName;
	double price;
	int productId;
public ProductDetail(int productId,String productName,double price) {
	this.productId=productId;
	this.productName=productName;
	this.price=price;
}
@Override
public String toString() {
	return "ProductDetail [productName=" + productName + ", price=" + price + ", productId=" + productId + "]";
}
}
