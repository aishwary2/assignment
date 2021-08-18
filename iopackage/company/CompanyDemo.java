package iopackage.company;

import java.io.*;

public class CompanyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\aishwary.joshi\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\com.string.practice\\src\\iopackage\\company\\company.txt");
		//System.out.println(f.exists());
		try {
			File file=new File("demo.txt");
			FileWriter fw=new FileWriter(file);
			fw.print()
//			FileReader fd=new FileReader(f);
//			BufferedReader br=new BufferedReader(fd);
//			String line=br.readLine();
//			while(line!=null) {
//				System.out.println(line);
//				line=br.readLine();
			}
		}
		catch(Exception e) {

		}
	}

}
;