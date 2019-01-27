import java.util.Scanner;


public class Circle {
	double rad=1.0;
	String color="red";
	float r1,area;
	
	
	Circle()
	{
		System.out.println("Instance radius is:"+rad);
		System.out.println("Instance colour is:"+color);
	}
	Circle(double rad)
	{
		this.rad=rad;
		System.out.println("Modified Radius is:"+rad);
	}
	Circle(double rad,String color)
	{
		this.rad=rad;
		this.color=color;
		System.out.println("Again Modified is:"+rad);
		System.out.println("Modified colour is:"+color);
	}
 void getRadius()
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("\nenter the radius");
	 r1=s.nextFloat();
 }
 void getarea()
 {
	 area=(float) (3.14*r1*r1); 
 }
 void display()
 {
	 System.out.println("User's entered radius is:"+r1);
	 System.out.println("area of circle is:"+area);
 }
 public static void main(String arg[])
 { 
	 Circle c=new Circle();
	 Circle c1=new Circle(2.0);
	 Circle c2=new Circle(3.0,"blue");
	c2.getRadius();
	c2.getarea();
	c2.display();
	
	
 }
}
