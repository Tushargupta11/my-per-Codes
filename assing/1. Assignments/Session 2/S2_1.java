import java.util.Scanner;
class S2_1
{
 public static void main(String args[])
 {
  double c,f;
  System.out.println("Enter your option\n1. Celcius to Fahrenheit\n2. Fahrenheit to Celcius");  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  switch(n)
  {
  case 1:
  System.out.println("Enter the value of temperature in Celcius");  
   c=sc.nextDouble();
   f=((9.0*c)/5.0+32.0);
  System.out.println("\nValue of Temperature in F :"+f);
  break;
  case 2:
   System.out.println("Enter the value of temperature in Fahrenheit");  
   f=sc.nextDouble();
   c=((f-32.0)*5.0)/9.0;
  System.out.println("Value of Temperature in c :" +c);
  break;
  default :
   System.out.println("Enter valid option"); 
  break;  
  }
 }
}