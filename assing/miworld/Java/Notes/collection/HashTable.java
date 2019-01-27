package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashMap<Long, String> myApps = new LinkedHashMap<Long, String>();
		    myApps.put(4L, "A");
		    myApps.put(14L, "B");
		    myApps.put(44L, "A");
		    myApps.put(54L, "B");
		    myApps.put(46L, "A");
		    myApps.put(543L, "B");
		    myApps.put(144L, "C");

		    ArrayList<String> names = new ArrayList<String>();

		    for (Map.Entry app : myApps.entrySet()) {

		        if (!(names.contains(app.getValue()))) {
		            names.add(app.getValue().toString());
		        }
		    }

		    System.out.println(names.size());
		    for (String s : names ) {
		        System.out.print(s + " ");
		        
	}

	}}
