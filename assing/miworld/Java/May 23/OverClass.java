class Overload1
{
 public int add(int a,int b)
 {
  return (a+b);
 }
 public byte add(byte a,byte b)
 {
  return(byte) (a+b);
 }
}
public class OverClass
{
 public static void main(String args[])
 {
  Overload1 ob=new Overload1();
  int Add;
  byte Adds;
  Add=ob.add(10,20);
  System.out.print("Add="+Add);
 }
}