package com.practice;

import java.util.Scanner;

public class CheckBracket {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Expression!!");
	String ss=s.nextLine();
	int openingCounter=0;//for(
	int closingCounter=0;//for)
	int openCounter=0;//for[
	int closeCounter=0;//for]
    char[] cc=ss.toCharArray();
    for(int i=0;i<cc.length;i++) {
    	if(cc[i]=='(' ) {
    		openingCounter++;
    	}
    	if(cc[i]==')' ) {
    		closingCounter++;
    	}
    	if(cc[i]=='[') {
    		openCounter++;	
    	}
    	if(cc[i]==']') {
    		closeCounter++;	
    	}
    }
    if(openingCounter==closingCounter && openCounter==closeCounter) {
    	System.out.println("The Expression is Valid");
    }
    if(openingCounter>closingCounter) {
    	System.out.println("Invalid expression: do not have )");
    }
    if(openingCounter<closingCounter) {
    	System.out.println("Invalid expression: do not have (");
    }
    if(openCounter>closeCounter) {
    	System.out.println("Invalid expression: do not have ]");
    }
    if(openCounter<closeCounter) {
    	System.out.println("Invalid expression: do not have [");
    }
}
}
