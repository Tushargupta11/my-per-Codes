class Try4
{
 public static void main(String args[])
 {
  try
  {
   int i[]=new int[5];
   i[10]=5;
   System.out.print(i[10]);
  }
  catch(Exception e)
  {
   System.out.println("Enter only 5 values");
  }
 }
}