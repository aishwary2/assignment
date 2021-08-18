package iopackage;

import java.io.File;

public class ContentDirectoryAndFile {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\aishwary.joshi\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\com.string.practice\\src");
		 
		String[] content = f.list();
		 if(f.isFile()) {
			 System.out.println("name of file"+f.getName()+"Name of Parent"+f.getParent()+"Path of file"+f.getPath());
			 System.out.println("Last Modified date"+f.lastModified()+f.length());
		 }
		 if(f.isDirectory()) {
		for (String entry : content) {
		    System.out.println(entry);
		}
		 }
	}

}
