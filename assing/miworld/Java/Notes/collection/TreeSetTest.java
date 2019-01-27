package collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Java");
		ts.add("PHP");
		ts.add("PHP");
		ts.add("C");
		ts.add("1");
		ts.add("2");
	ts.add(" ");
		//ts.add(" ");
	//ts.add(null);
		ts.add("BootStrap");
		
		System.out.println("TreeSet="+ts);
////		
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Android");
		ts1.add("Ruby");
		ts1.add("Python");
//		//ts1.add(null);
	ts.addAll(ts1);
	System.out.println("TreeSet All="+ts);
//////		
	System.out.println("HeadSet="+ts.headSet("BootStrap"));
		System.out.println("HeadSet="+ts.headSet("Python",true));
////	System.out.println("HeadSet="+ts.headSet("Python", false));
System.out.println("TailSet="+ts.tailSet("Python"));
	//System.out.println("TailSet="+ts.tailSet("Python", false));
////		
		System.out.println("TailSet="+ts.size());
//	System.out.println("isEmpty="+ts.isEmpty());
////		
		System.out.println("First Element="+ts.first());
		System.out.println("Last Element="+ts.last());
//		System.out.println("TreeSet="+ts);
		ts.pollFirst();
	ts.pollLast();
		System.out.println("TreeSet="+ts);
////		
//		System.out.println("Contains="+ts.contains("Java"));
////		System.out.println("dfgfdgtgs"+ts1);
////		System.out.println("ContainsAll="+ts.containsAll(ts1));
////		
		//Set<String> set=ts.descendingSet();
		//System.out.println("Set Collection="+set);
////		
////		
		System.out.println("SubSet="+ts.subSet("C", "Ruby"));
	System.out.println("Higher="+ts.higher("C"));
		System.out.println("Lower="+ts.lower("C"));
//	ts.retainAll(ts1);
//		System.out.println("RetainsAll="+ts);
//////		
//		System.out.println("TreeSet="+ts.remove("PHP"));
//		System.out.println("TreeSet="+ts);
//		ts.removeAll(ts1);
//		System.out.println("TreeSet="+ts);
//////		
//		TreeSet<String> ts2=new TreeSet<String>();
//		//ts2.add("");
//		ts2.add("Java");
//	
//		ts2.add("PHP");
//		ts2.add("C");
//		ts2.add("Java");
//		ts2.add("BootStrap");
//		ts2.add("");
//	
//		
		
//		System.out.println(ts2);
//		String []str=new String[ts2.size()];
//		ts2.toArray(str);
//		System.out.println("String Array Elements");
//		for(String s : str)
//		{
//			System.out.println(s);
//		}
////	
		
		ArrayList<String> al=new ArrayList<String>(ts1);
		Collections.reverse(al);
		System.out.println("Reverse="+al);
	}
}
