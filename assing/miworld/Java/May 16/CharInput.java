import java.util.*;
class CharInput
{
  public static void main(String args[])
  {
   char a;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the character");
   a=sc.next().charAt(0);
   System.out.println("Character is.."+a);
  }
}