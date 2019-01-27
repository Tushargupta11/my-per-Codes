import java.util.Scanner;
class Palindrome
{
 public static void main(String args[])
 {
  int n,rem,m,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number...");
  n=sc.nextInt();
  m=n;
  while(n!=0)
  {
   rem=n%10;
   sum=sum*10+rem;
   n=n/10;
  }
  if(m==sum)
  {
   System.out.print("\nThe given number is Palindrome Number  "+m);
  }
  else
  {
   System.out.print("\nThe given number is not a Palindrome Number"+m);
  }
 }
}