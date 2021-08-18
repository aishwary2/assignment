package com.practice;

public class Stringdemo {
	public static void main(String args[])
	{
		String str1 = "Hello";
		String str2 = "Testing";
		String str="Hello";
		String str3= new String("Hello");
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));	
		System.out.println(str1==str3);
		System.out.println(str==str1);	
		System.out.println(str1.equals(str3));
		System.out.println(str.charAt(3));
		System.out.println("index of 'p' is " + str.indexOf('p'));
		StringBuffer bf=new StringBuffer(str);
		System.out.println(bf.reverse());
		System.out.println(str.replace('H', 'Y'));
		System.out.println(str.substring(1,3));

	}
}
