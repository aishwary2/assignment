package com.practice;

import java.util.Scanner;

public class IncreasingNumber {
	boolean checkNumber(int number) {
		int curNo=number/10;
		int curDigit=number%10;
		while(curNo>0) {
			if(curDigit>=curNo%10) {
				return false;

			}else {
				curNo=curNo/10;
				curDigit=curNo%10;

			}
		}


		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		IncreasingNumber i=new IncreasingNumber();
		int number=s.nextInt();
		boolean b=i.checkNumber(number);
		System.out.println(b);
	}

}
