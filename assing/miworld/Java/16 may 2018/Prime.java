import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 { 
   double n,i=2,flag=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a no. to check whether it's prime");
   n=sc.nextDouble(); 
   for(;i<=n/2;i++)
  {
    if(n%i==0)
      { 
       flag=1;
       break;
      }
  }
    
    if(flag==0)
      { 
       System.out.println("Prime:"+n);
      }
     else
      { 
       System.out.println("Not Prime:"+n);
       }
 }
}

