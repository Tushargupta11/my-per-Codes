import java.util.Scanner;
class Pattern3
{
 public static void main(String args[])
 {
  int n,i,j,k,m;
  Scanner sc=new Scanner(System.in);
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
    System.out.print(" * ");
   }
   System.out.println();
  }
 }
}