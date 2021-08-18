package regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailRegx {
	  Scanner sc = new Scanner(System.in);
      String phone = sc.nextLine();
      String regex = 
      Pattern p1=Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";);
      System.out.println(p1.matcher(phone).matches());
      //Matching the given phone number with regular expression
      boolean result = phone.matches(regex);
      if(result) {
         System.out.println("Given email-id is valid");
      } else {
         System.out.println("Given email-id is not valid");
         
      }
}
}