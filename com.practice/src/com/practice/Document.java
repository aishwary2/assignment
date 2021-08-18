package com.practice;
import java.util.*;
public class Document {
	private String title;
	private String filepath;
	
String showDocumentinformation() {
	String res="{title:".concat(title).concat(",filepath:").concat(filepath).concat("}");
	return res ;
}
	public static void main(String[] args) {
		Document d=new Document();
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter Title!!");
          String title=s.nextLine();
          System.out.println("enter File Path!!");
          String filepath=s.nextLine();
          d.setTitle(title);
          d.setFilepath(filepath);
          String res=d.showDocumentinformation();
          System.out.println(res);
	}


	public String getFilepath() {
		return filepath;
	}


	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

}
