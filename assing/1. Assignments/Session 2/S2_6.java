import java.util.Scanner;
class S2_6
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  double bs,da,hra;
  System.out.println("Enter Ramesh's Basic Salary :");
  bs=sc.nextDouble();
  da=(40.0/100.0)*bs;
  hra=(20.0/100.0)*bs;
  System.out.println("Gross income of Ramesh :"+(bs+da+hra));
 }
}