class TestThrow
{
 static void validate(int age)
 {
  if(age<18)
  {
   throw new ArithmeticException("not valid");
  }
  else
  {
   System.out.print("Welcome to vote");
  }
 }
 public static void main(String args[])
 { 
  validate(13);
  System.out.print("rest of the code");
 }
}