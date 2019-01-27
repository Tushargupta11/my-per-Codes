package collection;
/*
The LinkedHashSet class extends HashSet class which implements Set 
interface. The Set interface inherits Collection and Iterable 
interfaces in hierarchical order.
•	HashSet doesn`t allow duplicate value.
•	HashSet does maintains the insertion order.
*/
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hh=new LinkedHashSet();
		hh.add("Praju");
		hh.add("");
		hh.add("");
		hh.add("Divya");
		hh.add("Ajay");
		hh.add("Divya");
		hh.add("Babalu");
		hh.add(1);
		hh.add("chotu");
		hh.add(null);
		hh.add("Himat");

		
		hh.remove("Babalu");
		
	
		System.out.println(hh);
	
	}

}
