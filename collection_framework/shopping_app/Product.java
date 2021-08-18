package collection_framework.shopping_app;

public class Product implements Comparable<Product>{
int id;
String name;
double price;
public Product(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}
@Override
public int compareTo(Product o) {
	// TODO Auto-generated method stub
	if(this.price==o.price)
		return 1;
	return 0;
}

}
