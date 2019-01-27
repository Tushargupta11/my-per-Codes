import java.util.Scanner;
class Pattern6
{
 public static void main(String arhs[])
 {
  int n,i,j,k,m;
  Scanner  sc=new Scanner(System.in);
  System.out.print("\nEnter the value of n..");
  n=sc.nextInt();
  m=n;
  for(i=1;i<=m;i++)
  {
   for(k=1;k<n;k++)
   {
    System.out.print(" ");
   }
   n--;   
   for(j=1;j<=i;j++)
   {
    if(j==1 || j==i)
    {
     System.out.print(" * ");
    }
    else 
    {
     System.out.print("  ");
    }
   }
   System.out.println();
  }
  for(i=1;i<=m-1;i++)
  {
   for(k=1;k<=i;k++)
   {
    System.out.print(" "); 
   }
   for(j=1;j<=m-i;j++)
   {
    if(j==1 || j==m-i)
    {
     System.out.print(" * ");
    }
    else 
    {
     System.out.print("  ");
    }
   }
   System.out.println();
  }
 }
}
