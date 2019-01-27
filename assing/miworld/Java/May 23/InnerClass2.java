class Outer
{
 static int a=20;
 static class Inner
 {
  void msg()
  {
   System.out.print("Static Inner class. Data = "+a);
  }
 }
}
class InnerClass2
{
 public static void main(String args[])
 {
  Outer.Inner i=new Outer.Inner();
  i.msg();
 }
}