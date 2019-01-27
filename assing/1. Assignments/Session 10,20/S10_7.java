/**
ABSTRACT CLASS
Rule:
1. If there is any abstract method in a class, that class must be abstract. 
2. An abstract class can have data member, abstract method,method body,constructor or even main() method.
exception  : 
*/

import java.util.*;
abstract class Staff
 {
  String name,address;
  Staff()
  { 
    System.out.println("Enter name of student");
    Scanner sc=new Scanner(System.in);
    name=sc.next();
    System.out.println("Enter address of student");
    address=sc.next();
  }
 }

class FullTimeStaff extends Staff
{
  String Department;
  int salary;
  FullTimeStaff()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Department \n1. HR\n2. IT");
      int m=sc.nextInt(); 
      switch(m)
      {
          case 1:
          { 
                   salary=10000;
                   System.out.println("salary="+salary); 
  
                    break;
          }
          case 2:
          {   
                   salary=8000;
                   System.out.println("salary="+salary); 
                   break;
          }
      }
   }
}
class PartTimeStaff extends Staff
{
   int noh,rph;
   PartTimeStaff()
   {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter No of hours and Rate per hour");
                 noh=sc.nextInt(); 
                 rph=sc.nextInt(); 
                 System.out.println(" salary="+(noh*rph));                 
   }

}
class S10_7
{
   public static void main(String args[])
   {

      System.out.println("Enter \n1. Full Time\n2. Part Time");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); 
      switch(n)
      {
        case 1:
        { 
        FullTimeStaff ob1=new FullTimeStaff();  
        break;
        }
        case 2:
        { 
        PartTimeStaff ob2=new PartTimeStaff();  
        break;
        }
        default :
        System.out.println("Enter valid option");

      }
   }
}

