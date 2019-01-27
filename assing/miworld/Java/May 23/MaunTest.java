class MaunTest
{
 public static void main(int a)
 {
  System.out.print("\nOverloaded main method"+a);
 }
 public static void main(String args[])
 {
  System.out.print("Main Method");
  main(10);
 }
}