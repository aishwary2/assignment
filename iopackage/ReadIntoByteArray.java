package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadIntoByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("demo.txt");
			//System.out.println(f.exists());
			FileInputStream in =new FileInputStream(f);
			int i;
			byte byteArray[]=new byte[1000];
			int counter=0;
			while((i=in.read())!=-1) {
				byteArray[counter]=(byte)i;
				System.out.println(byteArray[counter]);
				counter++;
			}
		
			  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
