import java.util.Scanner;
class S5_6
{
 public static void main(String args[])
 { 
   int n,a=0,b=1;
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter no of terms of Fibonacci Series ");
   n=sc.nextInt();
   int t =n; 
   if(n==0)
   {
     System.out.println("Enter no of terms greater than 0");  
   }
   else if(n==1)
   {
     System.out.println("Fibonacci Series\n0");  
   }
   else if(n==2)
   {
     System.out.println("Fibonacci Series\n0\n1");  
   }
   else if(n>2)
   {
   System.out.println("Fibonacci Series\n0\n1"); 
    for(int i=2;i<n;i++) 
    {
     t=a;
     a=b;
     b=t+b;
    System.out.println(b);  
     
    } 
   }


 }

}