package com.string.practice;

import java.util.Scanner;

public class NumberToString {
private double number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double res=sc.nextDouble();
NumberToString n=new NumberToString();
String str=n.numberOutPutInString(res);
System.out.println(str);
	}
	public String numberOutPutInString(double res) {
		// TODO Auto-generated method stub
		String rees=Double.toHexString(res);
		return rees;
	}
	public void setNumber(double number) {
		this.number = number;
	}

}
