import java.util.Scanner;
class Pattern
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int i,j,n;
  System.out.print("\nEnter the value of n..");
  n=sc.nextInt();
  int t=n;
  for(i=0;i<n;i++)
  {
   if(i<n/2+1)
   {
    for(j=0;j<i*2+1;j++)
    {
     System.out.print("* ");
    }
    System.out.println();
   }
   else
   {
    for(j=0;j<t/2+1;j++)
    {
     System.out.print("* ");
    }
    System.out.println();
    t=t-2;
   }
  }
  }
}