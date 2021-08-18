package collection_framework.customer;

import java.util.ArrayList;
import java.util.*;
/*customer list to perform different types of operations like add, remove,set
,remove duplicate customer names,sorting by name,sorting by product quantity.
(id,name,productQuantity)(sort with the help comparable and comparator)*/

public class CustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Customer> c=new ArrayList<Customer>();
//       c.add(new Customer(1,"Aish",5));
       //c.add(new Customer(1,"Aishwary",10));
       c.add(new Customer(1,"Aishwary",10));
       c.add(new Customer(4,"Aishadsf",1));
       c.add(new Customer(5,"Aisdfh",9));
        for(Customer d :c) {
        	System.out.println(d);
        }
//       Iterator<Customer> itr=c.iterator();  
//       while(itr.hasNext()){  
//       System.out.println(itr.next());  
//       }
	
	}

}
