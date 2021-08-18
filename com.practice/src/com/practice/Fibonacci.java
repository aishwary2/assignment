package com.practice;

import java.util.Scanner;

public class Fibonacci {
	int pre=1;
	int ppre=1;
	int cur=0;
	int nonRecursiveFibonacci(int n){
		int prev=1;
		int pprev=1;
		int curr=0;
		if(n==1||n==2) {
			return 1;
		}
		for(int i=3;i<=n;i++) {
			curr=prev+pprev;
			pprev=prev;
			prev=curr;
		}
		return curr;

	}
	int recursiveFibonacci(int i,int n) {

		if(n==1||n==2) {
			return 1;
		}
		if(i<=n) {
			cur=pre+ppre;
			ppre=pre;
			pre=cur;
			recursiveFibonacci(i+1,n);
		}
		return cur;

	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the nth value to be printed");
		int last=s.nextInt();
		Fibonacci f=new Fibonacci();
		int res=f.nonRecursiveFibonacci(last);
		System.out.println("By non recursive"+res);
		int ress=f.recursiveFibonacci(3,last);
		System.out.println("By recursive"+ress);
	}

}
