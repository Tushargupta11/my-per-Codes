import java.util.Scanner;
class S5_11
{
 public static void main(String args[])
 { 
   int n,rev=0,r,s;
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter a number ");
   n=sc.nextInt();
   int t =n; 
   while(n!=0)
   {
    r=n%10;
    rev=rev*10+r;
    n=n/10;
   }
    System.out.print(rev+"= ");
   while(rev!=0)
   {
    s=rev%10;
    if(s==0)
   System.out.print("Zero ");
    else if(s==1)
   System.out.print("One  ");
    else if(s==2)
   System.out.print("Two  ");
    else if(s==3)
   System.out.print("Three  ");
    else if(s==4)
   System.out.print("Four  ");
    else if(s==5)
   System.out.print("Five  ");
    else if(s==6)
   System.out.print("Six  ");
    else if(s==7)
   System.out.print("Seven  ");
    else if(s==8)
   System.out.print("Eight  ");
    else if(s==9)
   System.out.print("Nine  ");
    rev=rev/10;
   } 
 }

}