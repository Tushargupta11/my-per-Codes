import java.util.Scanner;
class Bank
{
 protected double si,p,t;
 final public void simpleInterest()
 {
  System.out.print("\nSimple Interest ="+si);
 }
}
class A extends Bank
{
 public double r=0.1;
 public A(double a,double b)
 {
  p=a;
  t=b;
 }
 void simple()
 {
  System.out.print("\n"+p+" "+r+" "+t);
  si=(p*r*t)/100.0;
  System.out.print("\n"+si);
 }
}
class B extends Bank
{
 public double r=0.09;
 public B(double a,double b)
 {
  p=a;
  t=b;
 }
 void simple()
 {
  si=(p*r*t)/100.0;
 }
}
class C extends Bank
{
 public double r=0.07;
 public C(double a,double b)
 {
  p=a;
  t=b;
 }
 void simple()
 {
  si=(p*r*t)/100.0;
 }
}
class SimpleInterest
{
 public static void main(String args[])
 {
  char bank1; 
  double p,t;
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter the bank...");
  bank1=sc.next().charAt(0);
  System.out.print("\nEnter the principle amount ..");
  p=sc.nextDouble();
  System.out.print("\nEnther the time period...");
  t=sc.nextDouble();
  switch(bank1)
  { 
   case 'A':
        A a=new A(p,t);
        a.simple();
        a.simpleInterest();
        break;
   case 'B':  
        B b=new B(p,t);
        b.simple();
        b.simpleInterest();
        break;
   case 'C' :
        C c=new C(p,t);
        c.simple();
        c.simpleInterest();
        break;
  }
 }
}