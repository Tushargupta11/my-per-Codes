import java.util.Scanner;
class Input
{
 public static void main(String args[])
 {
  int n,counteven=0,countodd=0;
  Scanner sc=new Scanner(System.in);
  do
  {
   System.out.print("Enter the number..");
   n=sc.nextInt();
   if(n%2==0)
   {
    counteven++;
   }
   else
   {
    countodd++;
   }
   if(n==0)
   {
    counteven--;
   }
  }while(n!=0);
  System.out.print("\nThe total number of even numbers are..."+counteven);
  System.out.print("\nThe total number of odd numbers are..."+countodd);
 }
}