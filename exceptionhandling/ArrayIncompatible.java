package exceptionhandling;

import java.util.Scanner;

public class ArrayIncompatible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		boolean res=false;

		System.out.println("enter iteger");
		do {
			try {
				Scanner sc=new Scanner(System.in);
				arr[0]=sc.nextInt();
				res=false;
			}
			catch(Exception e) {
				//e.printStackTrace();             
				//e.getStackTrace();
				System.out.println("Not of the type wanted try again\n");
				res=true;

			}	
		}while(res);
		System.out.println("its running");
	}
}
