class Try3
{
 public static void main(String args[])
 {
  try
  {
   String s="abc";
   int i=Integer.parseInt(s);
   System.out.print(i);
  }
  catch(Exception e)
  {
   System.out.println("Enter Number only");
  }
 }
}