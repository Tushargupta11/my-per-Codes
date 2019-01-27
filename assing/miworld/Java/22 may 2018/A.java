import java.util.Scanner;
class A
{
  int a=10;
  void show(int x,int y)
  {
   int c=x+y;
    System.out.println(c);
  }
  public static void main(String args[])
  {
    A obj=new A();
    Scanner sc1=new Scanner(System.in);
    obj.show(10,20);

  }
}