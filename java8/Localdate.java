package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Localdate {

	public static void main(String[] args) {
		 LocalDate date = LocalDate.now();  
		  
		    System.out.println("Today date: "+date);  
		   
		    LocalTime time = LocalTime.now();  
		    System.out.println(time);  
		    LocalDateTime now = LocalDateTime.now();  
		    System.out.println(now);
		    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
	        String formatDateTime = now.format(format);  
	        System.out.println(formatDateTime);
	}

}
