import java.util.Scanner;
class Factorial
{
 public static void main(String args[])
 {
  int n,i,fac=1;
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter a number to find factorial...");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
  {
   fac=fac*i;
  }
  System.out.print("\nThe factorial of given number "+n+" is "+fac);
 }
}