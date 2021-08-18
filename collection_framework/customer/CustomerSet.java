package collection_framework.customer;

import java.util.*;

public class CustomerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Customer> c=new HashSet<Customer>();
      c.add(new Customer(1,"Aish",5));
      c.add(new Customer(1,"Aishwary",10));
      c.add(new Customer(1,"Aishwary",10));
      c.add(new Customer(4,"Aishadsf",1));
      c.add(new Customer(5,"Aisdfh",9));
     
      Iterator<Customer> itr=c.iterator();  
      while(itr.hasNext()){  
      System.out.println(itr.next());  
      }
	}

}
