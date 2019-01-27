import java.util.Scanner;
class S5_2
{
 public static void main(String args[])
 { 
   int n,flag=0;
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter a number to check whether prime or not ");
   n=sc.nextInt(); 
   if(n<2)
   System.out.println("No ="+n+"is not prime");
   else 
{   
   for(int i=2;i<n/2;i++)
   { 
     if(n%i==0)
     flag=1;
     break;
   }
    
   if(flag==0)
  System.out.println("No ="+n+"is prime");
   else
   System.out.println("No ="+n+"is not prime");
}
 }

}