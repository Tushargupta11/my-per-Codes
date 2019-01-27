class Outer
{
 int data=20;
 void display()
 {
  class Inner
  {
   void msg()
   {
    System.out.println("Local Class. Data = "+data);
   }
  }
 Inner i=new Inner();
 i.msg();
 }
}
class InnerClass1
{
 public static void main(String args[])
 {
  Outer o=new Outer();
  o.display();
 }
}