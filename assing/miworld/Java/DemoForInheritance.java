import java.util.*;
class A
{
     public static int i=10;
     A()
     {
         System.out.println("Value of i in A="+i);
     }
}

class B extends A
{
    B()
    {
          super();
          System.out.println("Value if i in class B"+i);        
    }

}

class C extends B
{
    C()
    {
          super();
          System.out.println("Value if i in class C"+i);        
    }

}
class DemoForInheritance
{
    public static void main(String args[])
    {
         C obj2=new C();        
    }
}