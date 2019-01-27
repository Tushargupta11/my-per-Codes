package collection;

import java.util.PriorityQueue;

public class priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(5);
		pq.add(6);
		pq.add(4);
		pq.add(8);
		pq.add(3);
		pq.add(2);
		pq.add(10);
		System.out.println(pq.peek());
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("java");
		pq1.add("c");
		pq1.add("android");
	System.out.println(pq);
	System.out.println(pq1);
	}

}
