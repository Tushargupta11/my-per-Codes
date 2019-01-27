import java.util.Scanner;
class Expense
{
 public static void main(String args[])
 {
  int qty;
  double rate=0.0,total=0.0,dis=0.0,net=0.0;
  char ch;
  Scanner sc=new Scanner(System.in);
  do
  {
   System.out.print("\nEnter the Rate of the item..");
   rate=sc.nextDouble();
   System.out.print("\nEnter the Quantity of the item..");
   qty=sc.nextInt();
   total=total+(rate*qty);
   System.out.print("\nDo you want to enter more item...");
   ch=sc.next().charAt(0);
  }while(ch=='y' || ch=='Y');
  if(total>=1000)
  {
   System.out.print("\nCongratulations you got discount of 10%...");
   dis=(total*10.0)/100.0;
  }
  net=total-dis;
  System.out.print("\nTotal Expenses..."+net);
 }
}