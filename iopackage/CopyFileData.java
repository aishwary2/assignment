package iopackage;

import java.io.*;

public class CopyFileData {

	public static void main(String[] args)  {

		try {
		 PrintWriter pw = new PrintWriter("file2.txt");
         
	        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
	          
	        String line = br.readLine();
	          System.out.println(line);
	        
	        while (line != null)
	        {
	            pw.println(line);
	            line = br.readLine();
	        }
	        pw.close();
	        br.close();
	        }catch(Exception e) {
	        	System.out.println(e);
	        }
//	
	}

}
