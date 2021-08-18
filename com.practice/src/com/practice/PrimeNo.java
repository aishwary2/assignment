package com.practice;

import java.util.*;
class PrimeNo{

	int[] primeNumber(int n){
		int nillArr[]=new int[1];
		nillArr[0]=0;
		int x=0;
		int[] result=new int[n];
		if(n==0||n==1){
			return nillArr;
		}
		for(int i=2;i<=n;i++){
			int counter=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					counter=1;
				}
				if(counter==1)
				{
					break;
				}
			}
			if(counter==0) {
				result[x]=i;
				x++;
			}
		}
		return result;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int last=s.nextInt();

		//int[] result=new int[last];
		PrimeNo p=new PrimeNo();
		int result[]=p.primeNumber(last);

		if(result[0]==0){
			System.out.println("No Prime numbers found Between The Given Range");
		}else{
			for(int i=0;i<result.length;i++){
				if(result[i]==0)
					break;
				System.out.println(result[i]);
			}
		}


	}
}
