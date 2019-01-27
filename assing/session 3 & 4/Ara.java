import java.util.*;
class Ara
 {
  public static void main(String args[])
  {
   double l,b,r;
   double area , perimeter,area1,circumference;

   System.out.println("enter the length , breadth , radius");    
   Scanner sc = new Scanner(System.in);
     l = sc.nextDouble();
     b = sc.nextDouble();
     r = sc.nextDouble();
  
     area=(l*b);
     perimeter=2*(l+b);

  System.out.println("area of rect.:" +area);
  System.out.println("perimeter of rect.:" +perimeter);

     area1=3.14*(r*r);
     circumference=2*3.14*r;

  System.out.println(" ");
  System.out.println(" ");
 
  System.out.println("area of circle:" +area1);
  System.out.println("circumference of circle:" +circumference);

   }
  }