import java.util.Scanner;
class Demo
{
  public static void main(String args[])
  {        
        int n,countEven=0,countOdd=0;
        System.out.println("Welcome to APpedia Quiz");
        do
        {
        System.out.println("Enter no");         
        Scanner sc1=new Scanner(System.in);
          n=sc1.nextInt();
          switch(n)
         {
          default :
          if(n%2==0)
          {
           countEven++;
          }
          else
           countOdd++;
         }
        
        }while(n!=0);
       System.out.println("Odd Numbers="+countOdd);
       System.out.println("Even Numbers="+countEven);
  }
}