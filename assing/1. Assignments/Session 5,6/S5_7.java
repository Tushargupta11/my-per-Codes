import java.util.Scanner;
class S5_7
{
 public static void main(String args[])
 { 
   int n,fact=1;
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter no to calculate it's factorial ");
   n=sc.nextInt();
   if(n==0)
   {
     System.out.println("Factorial of 0 is 1");  
   }
   else if(n>=1)
   {
    for(int i=1;i<=n;i++) 
    {
    fact=fact*i;

     
    } 
    System.out.println("Factorial = "+fact);  
   }


 }

}