package collection;

import java.io.ObjectInputStream.GetField;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String>tt=new TreeMap<Integer, String>();
			tt.put(4, "www");
			tt.put(2, "ffff");
			tt.put(3, "ffff");
			tt.put(5, "bbb");
			tt.put(6, "cccc");
			tt.put(6, "cccc1");
			tt.put(6, "cccc11");
	// 	tt.put(null, null);
			tt.put(2, null);
			tt.put(2, null);
			tt.put(7, null);
			tt.put(2, null);
			tt.put(1, "");
			tt.put(12, "fffff");
			System.out.println(tt);
////
		Collection c=tt.keySet();
		Collection c1=tt.values();
			Iterator it=c.iterator();
			Iterator it1=c1.iterator();
			while (it.hasNext()) {
				System.out.println(it.next()+"Helloo"+it1.next());
	
	
			}	
			for(Object o:tt.keySet())
			{
					System.out.println(o+""+tt.get(o));
				
				
			}

//System.out.println(""+Arrays.asList(tt));
//		LinkedHashMap<Number, String>l=new LinkedHashMap<Number, String>();
//		l.put(1, "aa");
//		l.put(3, "");
//		l.put(2, "Hello");
//		l.put(4, "ccc");
//		l.put(3, "bbb");
//		l.put(5, "");
//		l.put(null, "Hellllllloo");
//	//	l.put(null, null);
//		System.out.println(l);

	}

}
