package collection;


/*
•	Linked List uses list as well as deque.
•	LinkList internally uses douplylinkedlist structure.
•	In case of linkedlist there is no more shifting operation.
•	But LinkedList is basically use for manipulation purpose(object).
*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("hii");
		link.add("hello");
		link.add("good");
		link.add("bad");
		link.add("");
		link.add(null);
		link.add("bad");
		System.out.println("list="+link);
		

////		
	link.offer("aaaa");
	System.out.println("offer="+link);
////////	
	link.offerLast("pagal1");
	link.offerFirst("Hiiiiiiii");
////		link.add(3,"Hellooooo");
////		
////		link.add("bad");
	System.out.println(link);
////////////
	System.out.println("descending order");
		Iterator<String> itr = link.descendingIterator();
		System.out.println("Descending Iterator");
		while(itr.hasNext())
		{
				System.out.println(itr.next());
		}
//////	
////////	
		link.remove(3);
		System.out.println("remove "+link);
////		
//		System.out.println("List Iterator");
		
		Iterator itr1 = link.listIterator(3);
			while(itr1.hasNext())
			{
					System.out.println("Index=="+itr1.next());
					
			}
////			
//	
	}

}
