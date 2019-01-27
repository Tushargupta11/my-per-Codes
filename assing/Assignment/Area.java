import java.util.Scanner;
class Circle
{
 double r,area,cir;
 Circle(double a)
 {
  r=a;
  area=0.0;
  cir=0.0;
 }
 void cal()
 {
  area=3.14*r*r;
  cir=2.0*3.14*r;
  System.out.print("\nThe area of circle is..."+area);
  System.out.print("\nThe circumference of circle is..."+cir);
 }
}
class Rectangle
{
 double l,h,area,peri;
 Rectangle(double a,double b)
 {
  l=a; h=b; area=0.0; peri=0.0;
 }
 void cal()
 {
  area=l*h;
  peri=2.0*(l+h);
  System.out.print("\nThe area of the rectangle is.."+area);
  System.out.print("\nThe perimeter of the rectangle is.."+peri);
 }
}
class Area
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 double r,l,h;
 System.out.print("\nEnter the radius of the circle..");
 r=sc.nextDouble();
 System.out.print("\nEnter the length of the Rectangle..");
 l=sc.nextDouble();
 System.out.print("\nEnter the breadth of the rectangle..");
 h=sc.nextDouble();
 Circle c=new Circle(r);
 c.cal();
 Rectangle rec=new Rectangle(l,h);
 rec.cal();
 }
}