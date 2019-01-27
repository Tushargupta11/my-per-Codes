class S2_4
{
 public static void main(String args[])
 {
  int a=20000,b=35000;
  System.out.println("Before Swap\na:"+a);
  System.out.println("b:"+b);  
  a=a^b;
  b=a^b;
  a=a^b;
  System.out.println("After Swap\na:"+a);
  System.out.println("b:"+b);
 }
}