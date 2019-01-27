package collection;
/*
•	It is Synchronized & Thread Safe.
•	Vector also Contain duplicate value.
•	It increase double of array current size.
•	Vector also contains duplicate element.
•	Vector uses the Enumeration interface to travers the a Vector element.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List l=new ArrayList();
	List vct = new Vector();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Second");
        vct.add(null);
        vct.add("Third");
        System.out.println(vct);
        //adding element at specified index
     vct.add(2,"Random");
        System.out.println(vct);
////        //getting elements by index
        System.out.println("Element at index 3 is: "+vct.get(4));
////        //getting first element
// System.out.println("The first element of this vector is: "+vct.);
////        //getting last element
       System.out.println("The last element of this vector is: "+vct.lastIndexOf(2));
////        //how to check vector is empty or not
//        System.out.println("Is this vector empty? "+vct.isEmpty());
//    vct.remove(3);
//        System.out.println("Is this vector empty? "+vct.isEmpty());
//        System.out.println(vct);
	}

}
