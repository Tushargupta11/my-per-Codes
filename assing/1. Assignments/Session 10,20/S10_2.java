class MyInteger
{
	private int i;
	MyInteger()
	{
		i=0;
		System.out.println("Value of i ="+i);
	}
	MyInteger(int i)
	{
		this.i=i;
	    System.out.println("Value of i ="+i);
	}
	void isNegative()
	{
		if(i<0)
		System.out.println("Value of i is negative="+i);
	    else
		System.out.println("check by using another function");			
	}
	void isPositive()
	{
		if(i>0)
		System.out.println("Value of i is postivetive="+i);
	    else
		System.out.println("check by using another function");
	}
	void isZero()
	{
		if(i==0)
		System.out.println("Value of i is zero="+i);
	    else
		System.out.println("check by using another function");
	}
	void isOdd()
	{
		if(i%2!=0)
		System.out.println("Value of i is odd="+i);
	    else
		System.out.println("check by using another function");
	}
	void isEven()
	{
		if(i%2==0)
		System.out.println("Value of i is even="+i);
	    else
		System.out.println("check by using another function");
	}	
	
}


class S10_2
{
 public static void main(String [] args)
 {
  MyInteger c1=new MyInteger();
  MyInteger c2=new MyInteger(Integer.parseInt(args[0]));
  c1.isZero();
  c2.isEven();
  c2.isNegative();
 }
}