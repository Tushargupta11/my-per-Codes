import java.util.Scanner;
class EvenOdd
{
 public static void main(String args[])
 {
   int a,b;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the Number...");
   a=sc.nextInt();
   if(a%2==0)
   {
    System.out.println("Number is Even");
   }
   else
   {
    System.out.println("Number is Odd");
   }
 }
}