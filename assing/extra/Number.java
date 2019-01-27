import java.util.Scanner;
class Number
{
 public static void main(String args[])
 {
  int n,rem=0,rev=0,count=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter the number...");
  n=sc.nextInt();
  System.out.println();
  while(n!=0)
  {
   rem=n%10;
   count++;
   rev=rev*10+rem;
   n=n/10;
  }
  while(rev!=0)
  {
   rem=rev%10;
   count--;
   switch(rem)
   {
    case 0:
           System.out.print(" Zero");
           break;
    case 1:
           System.out.print(" One");
           break;
    case 2:
           System.out.print(" Two");
           break;
    case 3:
           System.out.print(" Three");
           break;
    case 4:
           System.out.print(" Four");
           break;
    case 5:
           System.out.print(" Five");
           break;
    case 6:
           System.out.print(" Six");
           break;
    case 7:
           System.out.print(" Seven");
           break;
    case 8:
           System.out.print(" Eight");
           break;
    case 9:
           System.out.print(" Nine");
           break;
   }
   rev=rev/10;
  }
  if(count>0)
  {
   for(int i=1;i<=count;i++)
   {
    System.out.print(" Zero");
   }
  }
 }
}