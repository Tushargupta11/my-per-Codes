package collection;

import java.util.ArrayList;


import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

//IMP Points 
//1. ArrayLrist class can contain duplicate value
//2.ArrayLrist class maintain insertion order.
//3.ArrayLrist class is non synchronized.
//4.ArrayLristallow random access because array works at the index basis.
//5.ArrayLrist class manipulation slow because a lot of shifting need
//  to be occurred if any element is removed from the ArrayList


public class arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> aa=new ArrayList<String>();
		System.out.println("Initial Size="+aa.size());
	
		
		ArrayList <String>al = new ArrayList<String>();
		//al.add(null); it is allowed;
		System.out.println("Initial Size="+al.size());
		al.add("java");
		
		al.add("php");
		al.add("");
		al.add("java");
		al.add("c");
al.remove("java");
		al.add(0,"python");
		System.out.println("Remove duplicate"+al);
		System.out.println("Initial Size="+al.size());
		System.out.println("Result is:"+al);
			
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("c-objective");
		alist.add("skala");
		alist.add("ruby");
		
		al.addAll(alist);
	//	al.addAll(0,alist);
al.removeAll(alist);
//
	System.out.println("Add All Result"+al);
////////		
		System.out.println("Size="+al.size());
		System.out.println("isEmpty= "+al.isEmpty());
		System.out.println("contains= "+al.contains("java1"));
////////////
	System.out.println("containsAll= "+al.containsAll(alist));
	System.out.println("Get= "+al.get(2));
////////////		//Iterator it1=alist.iterator();
//////////		
	Iterator itr = al.iterator();
		
		System.out.println("Iterator values");
	
		while(itr.hasNext() )
		{
				System.out.println(itr.next());
		}
////////////		
//////////		//copy ArrayList to String[]
////////		
		String arr[] = new String[al.size()];
		al.toArray(arr);
	
//////////		
//////////		
		for(String a:arr)
		{
				System.out.println("String array="+a);
		}
////////		
//////		System.out.println("Cloning in object");
		Collections obj = (Collections) al.clone(); //Object class method
		System.out.println(obj);
//		//al.
		System.out.println("Cloning in arrayList");
		ArrayList<String> al1 = (ArrayList<String>)al.clone();
		System.out.println(al1);
////		
////	System.out.println("A1 DATA"+al);
////////		//retainAll it keep only elements of this collect alist
////		//al1.retainAll(al);
////		al1.retainAll(alist);
////////		//al.re
////		System.out.println("Retained: "+al1);
////		
//////
//////		ArrayList<Integer>aaa=new ArrayList<Integer>();
////		aaa.add(1);		
////		aaa.add(2);
////		aaa.addAll(aaa);
////		System.out.println(aaa);
		
	}

}
