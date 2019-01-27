import java.util.Scanner;
+

public class Primeno {
public static void main(String arg[])
{
	int i,j,n,p;
	System.out.println("enter the value of n");
	Scanner s1= new Scanner(System.in);
	n=s1.nextInt();
	for( i=2;i<=n;i++)
	{
		p=0;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			
				p=1;
			}
		if(p==0)
		{
			System.out.println(i);
		}
	}
	}
	}
	


