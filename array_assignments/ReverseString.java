package array_assignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
String input=sc.nextLine();
sc.close();
String res= reverseString(input);
System.out.println(res);
	}

	private static String reverseString(String input) {
		// TODO Auto-generated method stub
		String res;
		int j=0;
		char[] ch=input.toCharArray();
		char [] ra=new char[input.length()];
		for(int i=input.length()-1;i>=0;i--) {
			ra[j]=ch[i];
             j++;
		}
		res=String.valueOf(ra);
		return res;
	}

}
