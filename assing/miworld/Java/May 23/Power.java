class Power
{
	int pow(int n,int p)
	{
		if(n==0 ||p==0)
		{
			return 0;
		}
		else
		{
			if(p==1)
			{
				return 1;
			}
			else
			{
				return (n*pow(n,p-1));
			}
		}
	}
public static void main(String args[])
{
	int a;
	Power p=new Power();
	a=p.pow(10,2);
	System.out.print(a);
}
}