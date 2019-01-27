import java.util.Scanner;
class Rectangle
{
	String color;
	double width,length,area;
	void set_length()
	{
	 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		length=sc.nextDouble();
	} 
	void set_width()
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter width of rectangle");
		width=sc.nextDouble();	
	}
	void set_color()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color of rectangle");
		color=sc.next();
	}
	void final_area()
	{
		area=length*width;
	    System.out.println("Area of rectangle="+area);	
	}
	static void compare(Rectangle a,Rectangle b)
	{
		if(a.area==b.area&&a.color.equalsIgnoreCase(b.color))
			System.out.println("Rectanges matched");
		else
			System.out.println("Rectanges are different");
	}

}

class S10_12
{
	public static void main(String []ar)
	{
		Rectangle e1=new Rectangle();
		Rectangle e2=new Rectangle();	
	    System.out.println("Enter details of 1st Rectange");			
		e1.set_length();
		e1.set_width();
		e1.set_color();
		e1.final_area();
	    System.out.println("Enter details of 2nd Rectange");	
		e2.set_length();
		e2.set_width();
		e2.set_color();
		e2.final_area();
		Rectangle.compare(e1,e2);
	}
}