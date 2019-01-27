
class DemoThrow
{
   
	static void validage(int i)
	{
		if(i<18)
		{
			throw new ArithmeticException("Not valid to vote");
			
		}
		else
		System.out.println("Welcome to vote");
	}
	
 public static void main(String [] args)
 {
	try
	{
	    validage(16);	
    }
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	System.out.println("Testing done");
	
 
	

 }
}