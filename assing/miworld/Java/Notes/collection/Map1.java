package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Map<K, V> a=new Map<K, V>	
		HashMap<Number, String>map=new HashMap<Number, String>();
		map.put(3, null);
		map.put(2, null);
		//map.put(, "qqqqq");
		map.put(3, "qqqqq");
		map.put(10, "qqqqq");
		map.put(26, "");
		map.put(2, "qqqqq");
		map.put(1, "Hii");
		map.put(4, "Hello");
		map.put(null, "aaaa");
	//	map.put( "", "aaaa");
		System.out.println("Simple"+map);
//		System.out.println("Answer----------");
	System.out.println("Value is:"+Arrays.asList(map));
		System.out.println("Keyset"+map.keySet());
		for (Object o:map.keySet())
		{
			System.out.println(o+" "+map.get(o));
		}
////
	//System.out.println(map);
////	}
//	
	}
}
