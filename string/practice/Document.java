package com.string.practice;

import java.util.Scanner;

public class Document {
static String title,filepath;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		String filepath=sc.nextLine();
		Document d=new Document();
		d.setFilepath(filepath);
		d.setTitle(title);
		String res=showDocumentInformation();
        System.out.println(res);
	}
	private static String showDocumentInformation() {
		String res="{title:".concat(title).concat(",filepath:").concat(filepath).concat("}");
		// TODO Auto-generated method stub
		return res;
		
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
