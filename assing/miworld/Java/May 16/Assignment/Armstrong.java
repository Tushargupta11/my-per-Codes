import java.util.Scanner;
class Armstrong
{
 public static void main(String args[])
 {
  int n,sum=0,m,rem;
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter a three digit Number...");
  n=sc.nextInt();
  m=n;
  while(n!=0)
  {
   rem=n%10;
   sum=(sum)+(rem*rem*rem);
   n=n/10;
  }
  if(sum==m)
  {
   System.out.print("\nThe given number is a Armstrong Number.."+m);
  }
  else
  {
   System.out.print("\nThe given number is not an Armstrong number.."+m);
  }
 }
}