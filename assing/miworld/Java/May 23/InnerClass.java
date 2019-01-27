class Outer
{
 int a=20;
 class Inner
 {
  void msg()
  {
   System.out.println("Inner class. Data = "+a);
  }
 }
}
class InnerClass
{
 public static void main(String args[])
 {
  Outer o=new Outer();
  Outer.Inner i=o.new Inner();
  i.msg();
 }
}