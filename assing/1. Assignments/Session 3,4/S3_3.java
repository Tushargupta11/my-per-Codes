import java.util.Scanner;
class S3_3
{
 public static void main(String args[])
 { 
   int r,n,sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a 4 digit no ");
   n=sc.nextInt(); 
   while(n!=0)
   { 
     r=n%10;
     sum=sum+r;
     n=n/10;
    }
   System.out.println("Sum of Digits ="+sum);

 }

}