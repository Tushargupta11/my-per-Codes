/**
ABSTRACT CLASS
Rule:
1. If there is any abstract method in a class, that class must be abstract. 
2. An abstract class can have data member, abstract method,method body,constructor or even main() method.
exception  : 
*/

abstract class Bike
 {
  Bike()
  {
  System.out.printn("Bike is created");
  }
  abstract void run();
  void changeGear()
  {
   System.out.println("gear changed"); 
  }

 }

class Honda extends Bike
{
  void run()
  {
  System.out.println("Running safely");
  }
}
class Test
{
public static void main(String args[])
{
 Bike obj=new Honda();
 obj.run();
 obj.changeGear();
}
}
