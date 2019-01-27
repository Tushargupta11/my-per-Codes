abstract class Bike
{
 Bike()
 {
  System.out.print("\nBike is created");
 }
 abstract void run();
 void changeGear()
 {
  System.out.print("\nGear is changed");
 }
}
class Honda extends Bike
{
 void run()
 {
  System.out.print("\nRunning Safely");
 }
}
class TestAbstract
{
 public static void main(String args[])
 {
  Bike obj=new Honda();
  obj.run();
  obj.changeGear();	
 }
}