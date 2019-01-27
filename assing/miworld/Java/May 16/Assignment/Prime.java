import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  int a,n,i,flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the Number...");
  a=sc.nextInt();
  n=a/2;
  for(i=2;i<=n;i++)
  {
   if(a%i==0)
   {
    flag=1;
   }
  }
  if(flag==0)
  {
   System.out.println("Number is prime..");
  }
  else
  {
   System.out.println("Number is not prime..");
  }
 }
}