package Pack;
import Pack1.*;
class Second
{
 public static void main(String args[])
 {
  First f=new First();
  f.area();
  Third t=new Third();
  System.out.print("\nValue="+t.a);
 }
}