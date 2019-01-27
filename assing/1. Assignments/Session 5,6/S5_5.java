import java.util.Scanner;
class S5_5
{
 public static void main(String args[])
 { 
   int n,c=0,arm=0,r,R=1;
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter a number to check whether it's armstrong or not ");
   n=sc.nextInt();
   int t =n; 
   while(n!=0)
   {
    r=n%10;
    c++;
    n=n/10;
   }
   n=t;
   while(n!=0)
   {
    r=n%10;
    R=1;
    for(int i=1;i<=c;i++)
    { 
    R= R*r;
    }
    
  System.out.println("R="+R);    
    arm=arm+R;
    n=n/10;
   }
   if(t==arm)
  System.out.println("No ="+t+" is armstrong");
   else
   System.out.println("No ="+t+" is not armstrong");

 }

}