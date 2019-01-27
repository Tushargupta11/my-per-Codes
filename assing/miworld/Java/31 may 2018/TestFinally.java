/** Exception Handling 
book of java- headfirstjava
Checked - compile time errors - I/O Excdptions and SQL Exceptions (Throws used for it)
Unchecked - divide by 0 - runtime errors (throw can be used for both)

-->> Methods of object exception
getMessage() -> 
printStackTrace()
printStackTrace(PrintStream stream)

-->> Creating your own exception
[modifier]
         Finally     */

class TestFinally
{
      public static void main(String args[])
      {
      try
      {
            int data=25/5;
            System.out.println(data);
      }
      catch(NullPointerException e)
      {
            System.out.println(e);
      }
      finally
      {
            System.out.println("Finally block is printed");
      }
      }
}