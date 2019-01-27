import java.util.Scanner;
class SumDigits
{
 public static void main(String args[])
 {
  int n,rem,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter any number...");
  n=sc.nextInt();
  while(n!=0)
  {
   rem=n%10;
   sum=sum+rem;
   n=n/10;
  }
  System.out.print("\nThe sum digits of given number is..."+sum);
 }
}