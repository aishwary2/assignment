package collection_framework;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> i=new ArrayList<Integer>(); 
		i.add(1);
		i.add(3);
		i.add(1,6);
		i.add(3,8);
		
		System.out.println(i);
		System.out.println(i.contains(6)+"  "+i.get(0)+"list size"+i.size());
for(int j:i) {
	System.out.println(j);
}
Iterator it=i.iterator();
	}
	

}
