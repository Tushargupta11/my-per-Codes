/** Inheritance 
Method overriding (Dynamic binding) */
import java.util.Scanner;
class A
{
 A()
{
  System.out.println("Object created");
}

 public double i,x,y;
 void show(double p,double q)
{
  System.out.println("me show mw aa gya hu"); 
 i=(p*10*q)/100.0;
 System.out.println(i);
}
}

class B extends A
{

 void show(double p,double q)
{
 i=(p*9*q)/100.0;
 System.out.println(i);
}

}
class C extends B 
{
 void show(double p,double q)
{

 i=(p*7*q)/100.0;
 System.out.println(i);
}
}

class S10_1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Bank whose interest you want to calculate\n1. A\n2. B\n3. C");
  int n=sc.nextInt();
  System.out.println("Enter value of principle and time respectively");
  double p=sc.nextDouble();
  double t=sc.nextDouble();
  switch(n)
  {
   case 1:
    A a=new A();
    a.show(p,t);   
   break;

   case 2:
    B b=new B();
    b.show(p,t);  
   break;

   case 3:
    C c=new C();
    c.show(p,t);  
   break;
  }

 }
}