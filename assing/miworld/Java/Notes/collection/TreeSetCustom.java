package collection;
/*
•	TreeSet implements set interface and navigable set interface.
•	TreeSet doesn`t allow duplicate value.
•	TreeSet doesn`t allow NULL values if you pass NULL into Treeset it generate Null Pointer Exception.
•	TreeSet elements are stored in nature by default.
*/
import java.util.*;

public class TreeSetCustom 
{
	public static void main(String[] args) 
	{
		TreeSet<Trainer> ts=new TreeSet<Trainer>(new MyComp1());
		ts.add(new Trainer(104, "Ramesh", 5000.00));
		ts.add(new Trainer(109, "Kumar", 15000.00));
		ts.add(new Trainer(102, "Rohit", 50000.00));
		ts.add(new Trainer(103, "Jay", 50000.00));
		System.out.println("TreeSet="+ts);
	}
}
class MyComp1 implements Comparator<Trainer>
{
	@Override
	public int compare(Trainer o1, Trainer o2) 
	{
		if(o1.getTname().compareTo(o2.getTname())<0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}