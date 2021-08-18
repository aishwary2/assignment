package com.string.practice;

import java.util.Scanner;

public class Category {
	private String id,name,createDate;
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String id=sc.nextLine();
	String name=sc.nextLine();
	String createDate=sc.nextLine();
	Category m=new Category();
	m.setCreateDate(createDate);
	m.setId(id);
	m.setName(name);
	String res=m.showMemberDetail();
	System.out.println(res);
}

private String showMemberDetail() {
	// TODO Auto-generated method stub
	String res="{Id:".concat(id).concat(",name:").concat(name).concat(",createDate:").concat(createDate).concat("}");
	return res;

}

public void setCreateDate(String createDate) {
	this.createDate = createDate;
}

public void setName(String name) {
	this.name = name;
}

public void setId(String id) {
	this.id = id;
}
}
