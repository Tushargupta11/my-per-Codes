import java.util.Scanner;
class S3_7
{
 public static void main(String args[])
 { 
   int a,b,c,d,e;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 3 digits ");
   a=sc.nextInt(); 
   b=sc.nextInt(); 
   c=sc.nextInt(); 
   d=(a>b?(a>c?a:c):(b>c?b:c));
   e=(a<b?(a<c?a:c):(b<c?b:c));   
  
   System.out.println("Greatest digit is:"+d);
   System.out.println("Smallest digit is:"+e);

 }

}