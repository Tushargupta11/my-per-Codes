				//Demo of final method
class Shape
{
  final public double PIE=3.142;
 protected double ar;

 public final void display()
 {
  System.out.print("Area="+ar);
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
}

class FinalMethod
{
 public static void main(String args[])
 {
  Circle c=new Circle(2);
  c.area();
  c.display();
 }
}