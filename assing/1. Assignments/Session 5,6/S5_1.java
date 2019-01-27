import java.util.Scanner;
class S5_1
{
 public static void main(String args[])
 { 
   int a,x=0,y=1;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number of terms of Fibonacci Series ");
   a=sc.nextInt(); 
   if(a<1)
   System.out.println("Enter a valid no");
   else if(a==1)
   {
   System.out.println("Fibonacci Series:/n0");
   }
   else if(a==2)
   {
      System.out.println("Fibonacci Series:/n0/1");
   }
   else if(a>2)
   {
      System.out.println("Fibonacci Series:/n0/1");
    for(int i=2;i<=a;i++)
    {
     
    System.out.println("No ="+a+"is odd");
    }
 }

}