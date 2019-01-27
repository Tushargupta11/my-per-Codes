import java.util.Scanner;
class SumDigits1
{
 public static void main(String args[])
 {
  int n,rem,fd=0,ld,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter any number...");
  n=sc.nextInt();
  ld=n%10;
  while(n!=0)
  {
   if(n<10)
   {
    fd=n;
    n=n/10;
   }
   else
   {
    n=n/10;
   }
  }
  sum=fd+ld;
  System.out.print("\nThe sum first and last digits of given number is..."+sum);
 }
}