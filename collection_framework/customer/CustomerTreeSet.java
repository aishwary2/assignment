package collection_framework.customer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CustomerTreeSet {

	public static void main(String[] args) {
		TreeSet <Customer> c=new TreeSet<Customer>();
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


