class A
{
 public final int a=10;
 A()
 {
  System.out.print("\nDefault parent");
 }
 void show()
 {
  System.out.print("\nParent class");
 }
}
class B extends A
{
 public int b=10;
 void show()
 {
  System.out.print("\nChild");
 }
}
class OverRide extends B
{
 public static void main(String args[])
 {
  A b1=new B();
  b1.show();
  System.out.print("\n"+b1.a);
  System.out.print("\n"+b1.b);
  A a1=new A();
  a1.show();
 }
}