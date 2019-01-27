import java.util.Scanner;
class S3_4
{
 public static void main(String args[])
 { 
   int r,n,sum=0,c=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a First and last digit is ");
   n=sc.nextInt(); 
   while(n!=0)
   { 
     r=n%10;
     if(c==0 || c==3)
     {sum=sum+r;}
     n=n/10;
     c++;
    }
   System.out.println("Sum of Digits ="+sum);

 }

}