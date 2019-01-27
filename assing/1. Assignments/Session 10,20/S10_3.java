import java.util.Scanner;
interface IntDefine
{

	public void isNegative();

	public void isPositive();

	public void isZero();

	public void isOdd();

	public void isEven();
	
	public void isFactorial();

	//public void isPrime();

	//public void isSOD();	
	
	
}

class MyNumber implements IntDefine
{
	private int i;
	MyNumber()
	{
		i=0;
		System.out.println("Value of i ="+i);
	}
	MyNumber(int i)
	{
		this.i=i;
	    System.out.println("Value of i ="+i);
	}
	public void isNegative()
	{
		if(i<0)
		System.out.println("Value of i is negative="+i);
	    else
		System.out.println("check by using another function");			
	}
	public void isPositive()
	{
		if(i>0)
		System.out.println("Value of i is postivetive="+i);
	    else
		System.out.println("check by using another function");
	}
	public void isZero()
	{
		if(i==0)
		System.out.println("Value of i is zero="+i);
	    else
		System.out.println("check by using another function");
	}
	public void isOdd()
	{
		if(i%2!=0)
		System.out.println("Value of i is odd="+i);
	    else
		System.out.println("check by using another function");
	}
	public void isEven()
	{
		if(i%2==0)
		System.out.println("Value of i is even="+i);
	    else
		System.out.println("check by using another function");
	}	
	public void isFactorial()
	{
		int fact=1;
		if(i==0)
		System.out.println("Factorial of 0=1");
	    else
		{	
		    for(int j=1;j<=i;j++)
		    {	
               fact=fact*j;
	        }
		System.out.println("Factorial of"+i+"="+fact);	
	    }
	}
	
	
	
	
}


class S10_3
{
 public static void main(String [] args)
 {
  Scanner sc=new Scanner(System.in);
  MyNumber c1=new MyNumber(5);

  System.out.println("What you want to check\n1. Check for even\n2. Check for odd\n3. Check for positive\n4. Check for negative\n5. Check for zero\n6. Check for Factorial");  
  int n=sc.nextInt();
  switch(n)
  {
    case 1:
	c1.isEven();
	break;
    case 2:
	c1.isOdd();
	break;
    case 3:
	c1.isPositive();
	break;
    case 4:
	c1.isNegative();
	break;
    case 5:
	c1.isZero();
	break;
    case 6:
	c1.isFactorial();
	break;	
	default :
	System.out.println("Enter valid option");
    
  }
 }
}