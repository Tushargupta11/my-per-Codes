import java.util.Scanner;
class S5_4
{
 public static void main(String args[])
 { 
   int n,rev=0,r;
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter a number to check whether power of 2 or not ");
   n=sc.nextInt();
   int t =n; 
   while(n!=0)
   {
    r=n%2;

    rev=rev*10+r;
    n=n/2;
   }
   if(t==)
  System.out.println("No ="+t+" is palindrome");
   else
   System.out.println("No ="+t+" is not palindrome");

 }

}