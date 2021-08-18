package exceptionhandling;

public class DubleParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="s";
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
