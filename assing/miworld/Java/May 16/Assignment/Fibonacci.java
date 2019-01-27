import java.util.Scanner;
class Fibonacci
{
 public static void main(String args[])
 {
  int n,ft=0,st=1,next=0,i=1;
  Scanner sc=new Scanner(System.in); 
  System.out.print("\nEnter the number to print fibonacci...");
  n=sc.nextInt();
  System.out.print("\n "+ft+" "+st);
  do
  {
   if(i==1)
   {
    next=ft+st;
    System.out.print(" "+next);
    i++;
   }
   else
   {
    ft=st;
    st=next;
    next=st+ft;
    System.out.print(" "+next);
    i++;
   }
  }while(i<n-1);
 }
}