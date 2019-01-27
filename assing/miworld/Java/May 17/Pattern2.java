import java.util.Scanner;
class Pattern2
{
 public static void main(String args[])
 {
  int i,j,n;
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter the number of lines to print..");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
  { 
   for(j=1;j<=i;j++)
   {
    System.out.print(" *");
   }
   System.out.print("\n");
  }
 }
}