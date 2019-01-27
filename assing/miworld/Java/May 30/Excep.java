class Excep
{
 public static void main(String args[])
 {
  //int a=10/0;
  //System.out.println(a); //Arithematic Exception: / by zero
  //String s=null;
  //System.out.println(s.length());//java.lang.NullPointerException
  //String s="abc";
  //int i=Integer.parseInt(s);//NumberFormatException
  int a[]=new int[5];
  a[10]=5;//ArrayIndexOutOfBound : 10
 }
}