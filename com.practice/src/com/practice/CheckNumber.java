package com.practice;

import java.util.Scanner;

public class CheckNumber {
boolean checkNumber(int n) {
	int number=n;
	boolean b=true;
	while(number>0) {
		if(number%2==0) {
			
			number=number/2;
		}else {
			b=false;
			return b;
		}
		
	}
	b=true;
	return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNumber c=new CheckNumber();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
   boolean b=c.checkNumber(n);
   System.out.println(b);
	}

}
