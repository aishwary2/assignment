package exceptionhandling;

public class ArrayIndexOut {
	
	public static void main(String[] args) {
		String firstName[]= {"ais","zaf","adsfa","asdf","asdf","afda","fdf","sdfds","dsfds","sfds"};
		// TODO Auto-generated method stub
try {
	System.out.println(firstName[11]);
	
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
	}

}
