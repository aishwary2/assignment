package exceptionhandling.productexception.modal;

import java.util.regex.Pattern;

import exceptionhandling.productexception.exception.ProductException;

public class ProductList {
public static Product productList[]=new Product[1000];
static int counter=0;
public static void addProduct(Product p) {
	productList[counter]=p;
	counter++;
}
public void checker() throws ProductException {
	if(productList[0]==null) {
		try {
		throw new ProductException("List is empty");
		}
		catch(ProductException e) {
		
		}
	}
	int i=0;
	while(productList[i]!=null) {
		 Pattern p=Pattern.compile("[a-zA-Z+ ]*");
        
		if(productList[i].id<=0) {
			throw new ProductException("ID is not valid");
		}
		if(productList[i].name==null) {
			throw new ProductException("Name can not be null");
		}
		if(p.matcher(productList[i].name).matches()==false) {
			throw new ProductException("Name not valid");
		}
		i++;
	}
	System.out.println("ran sucessfully");
}
}
