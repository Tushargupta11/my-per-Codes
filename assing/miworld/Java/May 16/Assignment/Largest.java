import java.util.Scanner;
class Largest
{
 public static void main(String args[])
 {
  int a,b,c,max;
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter three Integers...");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  if(a>b)
  {
   if(a>c)
   {
    System.out.print("\nThe maximum number is.."+a);
   }
   else
   {
    System.out.print("\nThe maximum number is.."+c);
   }
  }
  else if(b>a)
  {
   if(b>c)
   {
    System.out.print("\nThe maximum number is.."+b);
   }
   else
   {
    System.out.print("\nThe maximum number is.."+c);
   }
  }
 }
}