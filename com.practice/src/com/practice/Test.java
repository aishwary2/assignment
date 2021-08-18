package com.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		FileWriter file;
		try{
			file =new FileWriter("hello.txt");
			BufferedWriter out=new BufferedWriter(file);
			System.out.println("Buffered writer started");
			out.write(69);
			out.write(49);
			out.close();
			System.out.println("sucessfully");
		}catch(IOException  excpt) {
			excpt.printStackTrace();
		}
		
	}

}
