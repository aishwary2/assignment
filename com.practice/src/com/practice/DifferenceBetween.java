package com.practice;

import java.util.Scanner;

public class DifferenceBetween {
	int calculateDifference(int n) {
		int sumOfSq=0;
		int sqOfSum=0;
		int diff=0;
		for(int i=1;i<=n;i++) {
			sumOfSq=sumOfSq+i*i;
			sqOfSum=sqOfSum+i;
		}
		sqOfSum=sqOfSum*sqOfSum;
		diff=sumOfSq-sqOfSum;
		return diff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the nth value to be printed");
		int n=s.nextInt();
		DifferenceBetween d=new DifferenceBetween();
		int diff=d.calculateDifference(n);
		System.out.println(diff);
	}

}
