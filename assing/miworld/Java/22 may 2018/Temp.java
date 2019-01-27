class Temp
{
 Temp()
 {
  this(5);
  System.out.println("The default constructor");
   //this(5)
 }
 Temp(int x)
 {
  this(5,15);
  System.out.println(x);
 }
 Temp(int x,int y)
 {
  System.out.println(x*y);
 }

public static void main(String args[])
 {
   new Temp();
 }

}
//Rules of constructor chaining
// 1. The this() expression should always be the first line of the constructor
// 2. There should be at-least be one constructor without this() keyword. 
// 3. Chaining of constructor can be done in any order.