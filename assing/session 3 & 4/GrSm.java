import java.util.Scanner;
class GrSm
{
 public static void main(String args[])
 {
 double a,b,c,d1,d2,t;
  System.out.println("Enter Three Values ");
 Scanner sc = new Scanner(System.in);
 System.out.println("enter a value: ");
 a = sc.nextDouble();
 System.out.println();
 System.out.println("enter b value: ");
 b = sc.nextDouble();
 System.out.println();
 System.out.println("enter c value: ");
 c = sc.nextDouble();
 System.out.println();

       t = a < b ? a : b;
       d1 = c < t ? c : t;
        System.out.println("Smallest Number is: " +d1);
      System.out.println();
      System.out.println(); 
      
       d2 = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number: " +d2);

 }
}