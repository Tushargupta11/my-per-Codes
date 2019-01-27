import java.util.Scanner;
class Input
{ 
  int b=10;
   Input()
  {
    System.out.println("No is = "+b);
  }
  void show(int a,int b)
 {
  //int a=10,b=20
  int c = a+b;
    System.out.println("Sum is = "+c);
  }
 public static void main(String args[])
 { 
   Input i=new Input();
   i.show(10,20);

 }

}