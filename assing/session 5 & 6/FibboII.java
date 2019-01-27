import java.util.Scanner;
class FibbII
 {
  public static void main(String args[])
  {
  int a=0,b=0,c=1,n;
  Scanner sc = new Scanner(System.in);
  System.out.print("enter values of n: "); 
  n=sc.nextInt();
  System.out.println("Fibbonaci Series is: ");
  for (int i=1;i<=n;i++)
  {
  a=b;
  b=c;
  c=a+b;
   System.out.print(a+ "  ");
  }
  }
 }