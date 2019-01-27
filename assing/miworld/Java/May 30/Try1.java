class Try1
{
 public static void main(String args[])
 {
  try
  {
   int a=10/0;
   System.out.print(a);
  }
  catch(Exception e)
  {
   System.out.println("Number cannot be divide by zero..");
  }
 }
}