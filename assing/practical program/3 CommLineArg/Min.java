import java.util.Scanner;
class Min{
		public static void main(String... s)
		{
				int i,j,max=0,min=0;
				int a[] = new int[10];
				Scanner sc = new Scanner(System.in);
				System.out.println("enter 10 elements");
				for(i=0;i<10;i++)
				{
						a[i]= sc.nextInt();
				}
				
				System.out.println("Array is ");
				for(i=0;i<10;i++)
				{
						System.out.print(a[i]+" ");
				}
				
				for(i=0;i<10;i++)
				{
						max=a[0];
						for(j=0;j<10;j++)
						{
								if(max<a[j])
									max=a[j];
						}
				}
				
				for(i=0;i<10;i++)
				{
						min=a[0];
						for(j=0;j<10;j++)
						{
								if(min>a[j])
									min=a[j];
						}
				}
				System.out.println("max ="+max);
				System.out.println("min ="+min);
		}
		
}