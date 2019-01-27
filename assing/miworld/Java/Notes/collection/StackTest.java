package collection;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest 
{
	public static void main(String[] args) 
	{
		Stack<String> stk=new Stack<String>();
		System.out.println("isEmpty="+stk.empty());
		stk.push("Android");
		stk.push("BootStrap");
		stk.push("PHP");
		stk.push("Ruby");
		System.out.println("Stack="+stk);
		System.out.println("Pop="+stk.pop());
	System.out.println("Stack="+stk);
	stk.remove(1);
	System.out.println(stk);
		System.out.println("isEmpty="+stk.empty());
	System.out.println("Peek="+stk.peek());
////		
System.out.println("Search="+stk.search("PHP"));
//		
		
		
	
		
	}
}