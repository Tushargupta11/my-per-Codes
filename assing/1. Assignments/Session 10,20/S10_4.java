import java.util.Scanner;
class Employee
{
    private static int count;
	int ID;
    String name;
    String Dept;
    Employee()
	{
		ID=0;
		Dept="NULL";
		name="APpedia";
		count++;	
	}
    Employee(int x,String s1,String s2)
	{
	    ID=x;
		Dept=s1;
		name=s2;
		count++;	
	}	

    static void showCount()
	{
		System.out.println(count+" objects created till now");	
	}
	public String toString()
	{
		return(ID+"\n"+Dept+"\n"+name);
	}
}


class S10_4
{
 public static void main(String [] args)
 {
    Employee obj=new Employee();
	Employee.showCount();
	System.out.println(obj.toString());
	Employee obj1=new Employee(1,"CS","Arpit");
	Employee.showCount();	
	System.out.println(obj1.toString());
    Employee obj2=new Employee(1,"IT","Kunal");
	Employee.showCount();
	System.out.println(obj2.toString());	
	Employee obj3=new Employee(1,"CS","Navin");
	Employee.showCount();
	System.out.println(obj3.toString());
 }
}