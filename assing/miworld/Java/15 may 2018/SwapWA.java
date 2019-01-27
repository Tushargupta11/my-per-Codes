class SwapWA
{
 public static void main(String args[])
 {
  int a=2,b=3;
  System.out.println("Before Swap\na:"+a);
  System.out.println("b:"+b);  
  a=a^b;
  b=a^b;
  a=a^b;
  System.out.println("After Swap\na:"+a);
  System.out.println("b:"+b);
 }
}