import java.util.Scanner;
class S5_8
{
 public static void main(String args[])
 { 
   int n,sum=0;
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter total no of items(Quantity) ");
   n=sc.nextInt();
   if(n==0)
   {
     System.out.println("Bill is Rs.0");  
   }
   else if(n>=1)
   {
    for(int i=1;i<=n;i++) 
    {
   System.out.println("Enter price of each item ");
      int m=sc.nextInt();
      sum=sum+m;
     
    } 
   if(sum>1000)
    {
    System.out.println("Bill = "+sum); 
    System.out.println("Amount after 10% Discount = "+(sum-(0.1*sum)));  
    }
   else
 System.out.println("Bill = "+sum); 
   }


 }

}