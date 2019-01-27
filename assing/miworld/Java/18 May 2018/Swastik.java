import java.util.Scanner;
class Swastik
{
  public static void main(String args[])
  {
    int i,j,k;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
           if((j==1&&i<=n/2)||(j==n/2)||(i==n/2)||(i==1&&j==n/2)||(i==n/2||j==n)&&i>n/2||(i==n&&j<=n/2))
             {
              System.out.print("*");
             }
           else
           System.out.print(" ");
         }
     System.out.println();
     }
   }
}