package com.string.practice;


import java.util.Scanner;

public class Emloyee {
	String firstName;
	String lastName;String companyName;
	String role;
  Emloyee(String firstName,String lastName,String companyName,String role){
	  this.firstName=firstName;
	  this.lastName=lastName;
	  this.companyName=companyName;
	  this.role=role;
  };
  String generatePassword() {
	  String str=firstName.substring(0,2).concat(lastName.substring(0,2)).concat(companyName.substring(0,2)).concat(role.substring(0,2));
	  return str;
  }
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String firstName=sc.nextLine();
	  String lastName=sc.nextLine();
	  String companyName=sc.nextLine();
	  String role=sc.nextLine();
	  
	  Emloyee em=new Emloyee(firstName,lastName,companyName,role);
	  String res=em.generatePassword();
	  System.out.println(res);
		// TODO Auto-generated method stub

	}

}
