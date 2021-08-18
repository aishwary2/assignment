package iopackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

public class BufferIO {

	public static void main(String[] args) {
		File f=new File("file.txt");
		try (FileOutputStream fr=new FileOutputStream(f);
			BufferedOutputStream bout=new BufferedOutputStream(fr);
				FileInputStream fi=new FileInputStream(f))
		{
			
			String str="Helloo you are in text file now";
			byte b[]=str.getBytes();
			bout.write(b);
			bout.flush();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
