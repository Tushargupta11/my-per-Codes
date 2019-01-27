class ParentNode
{
	int i=10;
}

class Child
{
	int 20;
	m1()
	{
	System.out.println("Value of i in child class"+i);
    System.out.println("Value of i in child class"+super.i);	
	}
}
class Test123
{
 public static void main(String [] args)
 {
  child c1=new child();
  c1.m1();
 }
}