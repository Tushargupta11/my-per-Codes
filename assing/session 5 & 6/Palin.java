import java.util.Scanner;
class Palin
{
 public static void main(String args[])
 {
 int n,m,rev=0,r;
 Scanner sc = new Scanner(System.in);
 System.out.print("enter no. for Palindrome check: ");
 n = sc.nextInt();
  m = n;
  while(n>0)
  {
   r=n%10;
   rev=(rev*10)+r;
   n=n/10;
  }
   if(rev == m)
   {
   System.out.println("Palindrome Number :) ");
   }
   else 
   {
   System.out.println(" Not Palindrome Number :( ");
   } 
 }
}