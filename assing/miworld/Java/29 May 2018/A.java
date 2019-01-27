/** Run time polymorphism can't be achieved with data members*/

class A
{
   int i=10;
   void m1()
   {
     System.out.println("Hey from Class A");
   }
}

class B extends A
{
   int i=20;
   void m1()
   {
     System.out.println("Hey from Class B");
   }
}

class Test
{
   public static void main(String args[])
   {
      A obj=new A();
      A obj1=new B();
      System.out.println(obj.i);
      System.out.println(obj1.i);
   }
   
}