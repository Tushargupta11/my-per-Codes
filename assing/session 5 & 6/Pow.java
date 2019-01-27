import java.util.Scanner;
class Pow
 {
  int power(int n,int p)
  {
   if(p==0)
  {
   System.out.println("not possible 1");
      return 1;
  }
   else if(p==1)
  {
      return n;
  }
   else 
  {
      return(n*power(n,p-1));
 }
 }
}
  class Poww
  {
  public static void main(String ...s)
  {
   Pow p1 = new Pow();
   Scanner sc =  new Scanner(System.in);
   System.out.println("enter number");
   int n = sc.nextInt();
   System.out.println("enter power");
   int p = sc.nextInt();
   System.out.println(p1.power(n,p));
  }
}