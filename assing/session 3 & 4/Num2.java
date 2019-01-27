import java.util.Scanner;
class Num2
 {
 public static void main (String args[])  
 { 
  System.out.println("To check first and last digit sum");
  System.out.println("enter any four digit number:");
  
  int x,sum=0;
  Scanner sc = new Scanner(System.in);
  x = sc.nextInt();
  sum = x/1000 + x%10;
 
	/* (x/1000) will take 1st digit  ,
	   (x%10) will take 4th digit    */

  System.out.println("  ");
  System.out.println("  ");
  System.out.println("Sum of 4-digit number is:" +sum);
 }
 }
   