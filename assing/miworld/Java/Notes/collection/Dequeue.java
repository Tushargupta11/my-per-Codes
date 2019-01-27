package collection;

import java.util.Deque;
import java.util.Dictionary;
import java.util.LinkedList;
import java.util.Scanner;

public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> d = new LinkedList<String>();
		//Scanner sc =new Scanner(System.in);
		d.add("java");
		d.add("c");
		d.add("android");
		System.out.println(d);
		
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		System.out.println(d.getClass());
			d.offer("html");
		System.out.println("Poll= "+d.poll());
//		System.out.println("Poll= "+d.poll());
	System.out.println("Peek= "+d.peek());
//
	System.out.println(d);
		System.out.println("PeekFirst= "+d.peekFirst());
//
		System.out.println(d);
		System.out.println("Poll= "+d.poll());
	System.out.println("polllast "+d.pollLast());
	System.out.println("pollFirst= "+d.pollFirst());
	
//		
	//	System.out.println(d);
	}

}
