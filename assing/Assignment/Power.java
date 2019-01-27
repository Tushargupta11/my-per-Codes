import java.util.Scanner;
class Power
{
 public static void main(String args[])
 {
  int n,flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter a number ...");
  n=sc.nextInt();
  while(n!=1)
  {
   if(n%2!=0)
   {
    flag=1;
    break;
   } 
   n=n/2;
  }
  if(flag==1)
  {
   System.out.print("\nThe given number is not a power of 2...");
  }
  else
  {
   System.out.print("\nThe given number is power of 2...");
  }
 }
}