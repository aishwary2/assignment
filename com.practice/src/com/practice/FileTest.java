package com.practice;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
class a{
	public a() {
		System.out.println("p");
	}
}
class b extends a implements Serializable{
	public b() {
		System.out.println("c");
	}
}
public class FileTest {

	public static void main(String[] args) {
		
	}

}
