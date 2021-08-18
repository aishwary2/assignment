package regularexpression;

//import java.util.Scanner;
import java.util.regex.Pattern;

public class Regx {

	public static void main(String[] args) {
		
		//----For Checking landline no
		  Pattern p=Pattern.compile("[0][7][5][5][-][1-7][0-9]{6}");
          System.out.println(p.matcher("0755-0312137").matches());
          ///-------For Aadhaar Card
          Pattern p1=Pattern.compile("[0-9]{4}[-][0-9]{4}[-][0-9]{4}");
          System.out.println(p1.matcher("0755-0312-1379").matches());
          //------remove 0-9
          String str = "one 9two4 three7 four1five";
          String[] arrOfStr = str.split("[0-9]");
    
          for (String a : arrOfStr)
              System.out.println(a.trim());
        //------remove letters
          String strr = "one 9two4 three7 four1five";
          String[] arrOfStrr = strr.split("[a-zA-Z]");
    
          for (String a : arrOfStrr)
          {   
        	  if(a.equals("") ||a.equals(" "))
        	  {
        		  
        	  }
        	  else
              System.out.println(a.trim());
          }
	}
	

}
