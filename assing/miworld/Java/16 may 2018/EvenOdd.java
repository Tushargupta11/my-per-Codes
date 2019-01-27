import java.util.Scanner;
class EvenOdd
{
 public static void main(String args[])
 { 
   int a;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number to check whether odd or even ");
   a=sc.nextInt(); 
   if(a%2==0)
   System.out.println("No ="+a+"is even");
   else
   System.out.println("No ="+a+"is odd");

 }

}