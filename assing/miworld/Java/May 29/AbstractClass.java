import java.util.Scanner;
abstract class Staff
{
 Scanner sc=new Scanner(System.in);
 String name,address;
 Staff()
 {
  System.out.print("\nEnter the name...");
  name=sc.next();
  System.out.print("\nEnter the address...");
  address=sc.next();
 }
}
class FullTimeStaff extends Staff
{
 Scanner sc=new Scanner(System.in);
 String dept;
 double salary;
  void menuDepartment()
  {
   System.out.print("\nSelect your Department..");
   System.out.print("\n1.IT");
   System.out.print("\n2.HR");
   System.out.print("\n3.DEVELOPER");
   System.out.print("\n4.TESTER");
   System.out.print("\n5.DOCUMENTATION");
  }
  void returnSalary(int x)
  {
   switch(x)
   {
    case 1:  salary=15000.0;
             break;
    case 2:  salary=20000.0;
             break;
    case 3:  salary=22000.0;
             break;
    case 4:  salary=18000.0;
             break;
    case 5:  salary=35000.0;
             break;
    default :salary=0.0;
   }
   System.out.print("\nSalary is...."+salary);
  }
 
}
class PartTimeStaff extends Staff
{
 Scanner sc=new Scanner(System.in);
 double rate,hours;
 PartTimeStaff()
 {
  rate=100.0;
  System.out.print("\nEnter the worked Hour..");
  hours=sc.nextDouble();
 }
 void returnAmount()
 {
   double amount;
   amount=rate*hours;
   System.out.print("\nThe Total amount is...."+amount);
  
 }
}
class AbstractClass
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("\nSelect your choice...");
  System.out.print("1.Full Time Staff...");
  System.out.print("2.Part Time Staff...");
  int ch,dept;
  ch=sc.nextInt();
  switch(ch)
  {
   case 1:
         FullTimeStaff s = new FullTimeStaff();
         s.menuDepartment();
         dept=sc.nextInt();
         s.returnSalary(dept);      
         break;
   case 2:
         PartTimeStaff s1=new PartTimeStaff();
         s1.returnAmount();
         break;
   default :
          System.out.print("\nEnter the valid option...");
  }
 }
}