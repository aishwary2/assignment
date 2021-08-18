package com.string.practice;

import java.util.Scanner;

public class Member {
  private	String firstName,lastName,email,password,role;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String firstName=sc.nextLine();
String lastName=sc.nextLine();
String email=sc.nextLine();
String password=sc.nextLine();
String role=sc.nextLine();
Member m=new Member();
m.setEmail(email);
m.setFirstName(firstName);
m.setLastName(lastName);
m.setPassword(password);
m.setRole(role);
String res=m.showMemberDetail();
System.out.println(res);

	}

	private String showMemberDetail() {
		// TODO Auto-generated method stub
		String res="{firstName:".concat(firstName).concat(" ").concat(lastName).concat(",email:").concat(email).concat(",password:").concat(password).concat(",role").concat(role).concat("}");
				return res;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
