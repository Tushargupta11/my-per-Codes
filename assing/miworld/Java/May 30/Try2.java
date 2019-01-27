class Try2
{
 public static void main(String args[])
 {
  try
  {
   String s=null;
   System.out.print(s.length());
  }
  catch(Exception e)
  {
   System.out.println("Length of null value cannot be calculated");
  }
 }
}