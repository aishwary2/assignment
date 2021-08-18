package exceptionhandling.productexception.main;

import exceptionhandling.productexception.exception.ProductException;
import exceptionhandling.productexception.modal.Product;
import exceptionhandling.productexception.modal.ProductList;

public class Main {

	public static void main(String[] args) throws ProductException {
		// TODO Auto-generated method stub
		//Product p1=new Product(11,"myname",22.3,"black");
		//Product p2=new Product(11,"my name",22.3,"black");
ProductList p=new ProductList();
p.checker();
	}

}
