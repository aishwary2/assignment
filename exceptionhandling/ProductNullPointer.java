package exceptionhandling;

public class ProductNullPointer {
public String[] listOfProducts() {
	String str[]={"hello","it","is","the","list"};
	return str;
}
	public static void main(String[] args) {
		try {
		ProductNullPointer lis = null;
		lis.listOfProducts();
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}
