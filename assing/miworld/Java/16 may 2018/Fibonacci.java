import java.util.Scanner;
class Fibonacci
{
 public static void main(String args[])
 { 
   int n,a=0,b=1,c,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a no. of terms in Fabonacci Series");
   n=sc.nextInt(); 
           System.out.println("Fabonacci Series is:");
   if(n==1)
    {
           System.out.println("0");
    }
   else if(n==2)
    {
           System.out.println("0\n1");
    }

  
     else if(n>2)
      {            System.out.println("0\n1");
        for(i=2;i<n;i++)
         {
           c=b; 
           b=a+b;
           a=c;
       System.out.println(b);
      
         }

       }
      else
      {
           System.out.println("Enter Valid no");
      }

 }
}

