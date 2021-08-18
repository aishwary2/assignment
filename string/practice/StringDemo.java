package com.string.practice;

import java.util.Scanner;

public class StringDemo {
	private String input;
public static void main(String args[]) {
	
	Scanner sc =new Scanner(System.in);
	String input=sc.nextLine();
	StringDemo sd=new StringDemo();
	sd.setInput(input);
	String res =sd.getRequiredData();
	System.out.println(res);
}
private String getRequiredData() {
	// TODO Auto-generated method stub
	String res;
	if(input=="") {
		res="there is no String";
	}else {
		res=input;
	}
	return res;
}
public void setInput(String input) {
	this.input = input;
}
}
