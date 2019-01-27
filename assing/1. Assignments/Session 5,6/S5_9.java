import java.util.Scanner;
class S5_9
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  double bs,da,hra;
  System.out.println("Enter Ramesh's Basic Salary :");
  bs=sc.nextDouble();
  if(bs<1501)
  {
  da=(25.0/100.0)*bs;
  hra=(10.0/100.0)*bs;
  System.out.println("Gross income of Ramesh :"+(bs+da+hra));
  }
  else
  {
  da=(50.0/100.0)*bs;
  hra=500;
  System.out.println("Gross income of Ramesh :"+(bs+da+hra));
  }
 }
}