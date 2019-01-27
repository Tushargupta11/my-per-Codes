class swap
{
  public static void main(String args[])
  {
   int a=7,b=5;
   System.out.println("Before Swaping\na="+a);  
   System.out.println("b="+b);  
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("After Swaping\na="+a);  
   System.out.println("b="+b);  
  }
}