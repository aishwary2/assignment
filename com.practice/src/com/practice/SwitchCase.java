package com.practice;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int aa=0;
		if(age<18) {
			aa=1;
		}
		if(age>=18 || age<35) {
			aa=2;
		}
		if(age>=45 ||age<60) {
			aa=3;
		}
		if(age>=60) {
			aa=4;
		}
		switch (aa) {
		  case (1):
			  System.out.println("You Are Child");
		  break;
		  case (2) :
			  System.out.println("You Are A Men Now"); 
		    break; 
		  case (3):
			  System.out.println("You Are getting old"); 
		    break; 
		  default: 
		    
		    break; 
		}

	}

}
