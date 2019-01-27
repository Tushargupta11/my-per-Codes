package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk=new Stack<String>();
		System.out.println("isEmpty="+stk.empty());
		stk.push("Android");
		stk.push("BootStrap");
		stk.push("PHP");
		stk.push("Ruby");
		System.out.println("Stack="+stk);
		System.out.println("Pop="+stk.pop());
		System.out.println("Stack="+stk);
		System.out.println("isEmpty="+stk.empty());
		System.out.println("Peek="+stk.peek());
		
		Queue<String> queue=new LinkedList<String>();
		queue.add("Java");
		queue.add("PHP");
		queue.add("Python");
		System.out.println("Queue="+queue);
	}

}
