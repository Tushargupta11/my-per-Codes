import java.util.Scanner;
class S3_2
{ 
    
 public static void main(String args[])
 { 
   double a,b,c,p,area,areac,r;
   double avg;
   System.out.println("Enter length and breadth of a rectangle");
   Scanner sc=new Scanner(System.in);
   a=sc.nextDouble();
   b=sc.nextDouble();
   System.out.println("Enter radius of a circle");  
   r=sc.nextDouble();
   p=2.0*(a+b);
   area=(a*b);
   c=2.0*3.14*r;
   areac=3.14*r*r;
   System.out.println("Perimeter of rectangle  ="+p);
   System.out.println("Area of rectangle ="+area);
   System.out.println("Circumference of circle  ="+c);
   System.out.println("Area of circle ="+areac);
 }

}