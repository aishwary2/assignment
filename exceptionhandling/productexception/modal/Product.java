package exceptionhandling.productexception.modal;

public class Product {
	 int id;
	String name,color;
	double price;
public Product(int id,String name,double price,String color){
	this.id=id;
	this.name=name;
	this.price=price;
	this.color=color;
	ProductList.addProduct(this);
}


}