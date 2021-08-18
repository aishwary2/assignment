package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class IOclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f=new File("demo.txt");
			System.out.println(f.exists());
			FileInputStream in =new FileInputStream(f);
			int i;
			while((i=in.read())!=-1) {
				System.out.print((char)i);
			}
			FileReader fr=new FileReader(f);
			int ii;
			  while((ii=fr.read())!=-1)    
		          System.out.print((char)ii);    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}

}
