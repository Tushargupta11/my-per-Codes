/** Inheritance 
A a1=new B(); <-- this is also valid and is called UPCASTING */

class A
{
 A()
 {
   System.out.println("Default Constructor");
 }
 public final int a=10;
 

void show()
 {
   System.out.println("Parent class");
 }
}

class B extends A
{
  int b=20;
 void show()
 {
   System.out.println("Parent class");
 }

}

class C extends B
{
 public static void main(String args[])
 {
  A B1=new B();   // Upcasting
  B1.show();
  System.out.println(B1.a);
  System.out.println(B1.b);
  A A1=new A();
  A1.show();

 }
}