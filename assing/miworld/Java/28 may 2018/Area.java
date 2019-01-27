/** Inheritance 
Demo of final keyword */

class Shape
{
 public final double PIE=3.142;
 protected double ar;
 public double r;

  final public void display()
 {
   System.out.println("Area="+ar);
 }
 
}

class Circle extends Shape
{
  public double radius;
 public Circle()
 {
   radius=0;
 }
 public Circle(int r)
 {
   radius=r;
 }
public void area()
{
 ar=PIE*radius*radius;
}
public void area(int r)
{
 ar=PIE*r*r;
}
}
class FinalTest
{
 public static void main(String args[])
 {
  Circle c=new Circle(2);   // Upcasting
   c.area();
  c.display();

 }
}