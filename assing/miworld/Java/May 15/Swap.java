class Swap
{
  public static void main(String args[])
  {
   int a,b;
   a=5;
   b=6;
   System.out.println(a+" "+b);
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println(a+" "+b);
  }
}