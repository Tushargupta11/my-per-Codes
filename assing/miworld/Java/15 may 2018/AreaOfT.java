import java.lang.Math;
import java.util.Scanner;
class AreaOfT
{
 public static void main(String args[])
 {
  double a=1,b=4,c=2,s,area;
  System.out.println("Sides of Triangle \na :" +a);
  System.out.println("b :" +b);
  System.out.println("c :" +c);
  s=(a+b+c)/2;
  System.out.println("s :" +s);
  area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
  System.out.println("Area of triangle :"+area);
 }
}