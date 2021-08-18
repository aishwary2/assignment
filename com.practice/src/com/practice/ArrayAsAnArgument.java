package com.practice;

public class ArrayAsAnArgument {
	public static void main(String args[]) {
		int arr[]= {5,6,7,8,9,10};
		int arr1[]=arrayAsAnArgument(arr);
		for(int a:arr1) {
			System.out.println(a);
		}
	}

	private static int[] arrayAsAnArgument(int[] arr) {
		// TODO Auto-generated method stub
		return arr;
	}

}
