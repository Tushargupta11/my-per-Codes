import java.util.*;
abstract class Staff
 {
  String name,address;
  
  Staff()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name: ");
    name = sc.next();
    System.out.println("enter address");
    address = sc.next();
  }
 }

 class PartTimeStaff extends Staff
 {
  Scanner sc = new Scanner(System.in);


   double rate=100.0,hours;
   PartTimeStaff()
   {
         System.out.println("enter no. of working  hours;");
    hours = sc.nextDouble();          
   }

    void rate() 
   {
     double amu;
     amu = rate*hours;
     System.out.println("total salary: " +amu);
     
    }
 }


 class FullTimeStaff
 {
  Scanner sc = new Scanner(System.in);


   int depart;
   double salary;  
   FullTimeStaff()
   {
    System.out.println("\n 1. HR manager");    
    System.out.println("2.IT");
    System.out.println("3.Developer");
    System.out.println("4.Tester");
    System.out.println("5.Documentation");

    System.out.println("enter Department: ");
    depart=sc.nextInt(); 
   }
     
   void salary()
   {
    switch(depart)
    {
     case 1:
           salary=10000.0;
           break;	
            
    case 2:
          salary=15000.0;
          break;
          
    
   case 3:
         salary=20000.0;
         break;     
         
  
   case 4:
         salary=30000.0;
          break; 
         
   case 5:
         salary=50000.0;
         break;
  
   default : salary=0.0;       
 
  }
   System.out.println("\n salary is: " +salary);
}
}

class Ain
 {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter type of Staff: ");
    System.out.println("\n 1.PartTimestaff");
    System.out.println("\n 2.FullTimeStaff");
   int ch;

  ch= sc.nextInt();

   switch(ch)
   {
    case 1:
          PartTimeStaff S2 = new PartTimeStaff();
          S2.rate(); 
          break; 

    case 2:
          FullTimeStaff S1 = new FullTimeStaff();
           S1.salary(); 
	  
 
          break;
    default:
           System.out.println("enter valid entry"); 
    }
  }
}