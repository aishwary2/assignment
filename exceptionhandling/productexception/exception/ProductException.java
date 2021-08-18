package exceptionhandling.productexception.exception;

public class ProductException extends Exception {
	
public ProductException(String str){
	System.out.println(str);
	//super(str);
}
}
