import java.util.Scanner;
class S5_3
{
 public static void main(String args[])
 { 
   int n,rev=0,r;
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter a number to check whether palindrome or not ");
   n=sc.nextInt();
   int t =n; 
   while(n!=0)
   {
    r=n%10;
    rev=rev*10+r;
    n=n/10;
   }
   if(t==rev)
  System.out.println("No ="+t+" is palindrome");
   else
   System.out.println("No ="+t+" is not palindrome");

 }

}