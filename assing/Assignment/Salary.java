import java.util.Scanner;
class Salary
{
 public static void main(String args[])
 {
  int sal;
  double hra,da,gross;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the basic salary...");
  sal=sc.nextInt();
  if(sal<1500)
  {
   hra=(sal*10.0)/100.0;
   da=(sal*25.0)/100.0;
  }
  else
  {
   hra=500;
   da=(sal*50.0)/100.0;
  }
  gross=sal+hra+da;
  System.out.print("\nThe Basic Salary is..."+sal);
  System.out.print("\nThe HRA is..."+hra);
  System.out.print("\nThe DA is..."+da);
  System.out.print("\nThe Gross Salary is..."+gross);
 }

}