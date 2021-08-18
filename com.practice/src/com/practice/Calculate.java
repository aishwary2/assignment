package com.practice;

import java.util.Scanner;

public class Calculate {
	int CalculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 ||i%5==0) {
				sum=sum+i;
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the nth value");
		int n=s.nextInt();
		Calculate c=new Calculate();
		int sum=c.CalculateSum(n);
		System.out.println(sum);

	}

}
