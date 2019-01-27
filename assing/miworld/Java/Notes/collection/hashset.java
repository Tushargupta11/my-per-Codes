package collection;
/*
•	HashSet doesn`t allow duplicate value.
•	HashSet doesn`t maintains the insertion order.
*/
import java.util.HashSet;

public class hashset {

strictfp 	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		HashSet h=new HashSet();
	
		
		h.add("");
		h.add(null);
		h.add(null);
		h.add("AAAA");
		h.add("BBBB");
		h.add("Hello");
		h.add("Hh");
		h.add("AA");
		h.add("Hello");
	
//	System.out.println("Hashset="+h.add("w"));
//	h.remove("w");
		System.out.println("Hashset="+h);
		/*HashSet h =new HashSet();
		h.add("Hello");
		h.add("Bye");
		h.add("Hi");
		h.add("Hi");
		h.add("hi");

		h.add(null);
		h.add(null);
		
		System.out.println(h);*/
		
	}

}
