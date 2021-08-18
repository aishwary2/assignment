package array_assignments;

import java.util.Scanner;

public class CopyContentReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String str[]=new String[10];
      for(int i=0;i<10;i++) {
    	  System.out.println("Enter array element "+i);
    	  str[i]=sc.nextLine();
    	  }
   //   System.out.println(str.length);
      String res[]=copyContentReverseOfArray(str);
      for(int i=0;i<10;i++) {
    	  System.out.println(res[i]);
    	  
    	  }
	}

	private static String[] copyContentReverseOfArray(String[] str) {
		// TODO Auto-generated method stub
		String res[]=new String[str.length];
		int j=0;
		for(int i=str.length-1;i>=0;i--) {
			res[j]=str[i];
			j++;
		}
		return res;
	}

}
