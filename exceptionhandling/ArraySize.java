package exceptionhandling;

import java.util.Scanner;

public class ArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			int i=sc.nextInt();
			int arr[]=new int[i];
		} catch (NumberFormatException  | NegativeArraySizeException e) {
		System.out.println(e);
		}

	}

}
