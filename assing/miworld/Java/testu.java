class ParentNode
{
	int i=10;
}

class Child
{
	int i= 20;
	void m1()
	{
	System.out.println("Value of i in child class"+i);
    System.out.println("Value of i in child class"+super.i);	
	}
}
class Test123
{
 public static void main(String [] args)
 {
  Child c1=new Child();
  c1.m1();
 }
}