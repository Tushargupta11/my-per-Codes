import java.util.Scanner;
class AreaOfCircle
{
 public static void main(String args[])
 { 
   double r,cir,area;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a radius of circle ");
   r=sc.nextDouble(); 
   cir=2*(3.14)*r;
   area=(3.14)*r*r;
   System.out.println("Radius ="+r);
   System.out.println("Circumference ="+cir);
   System.out.println("Area ="+area);

 }

}