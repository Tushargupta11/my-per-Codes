import java.util.*;
interface i1
{
     static int i=10;
     public void A();
}

interface i2
{
     static int i=100;
     public void A();
}

class B implements i1,i2
{
    public void A()
    {
          System.out.println("Value if i ="+i2.i);        
    }

}
class DemoInterface
{
    public static void main(String args[])
    {
         B obj2=new B();    
         obj2.A();    
    }
}