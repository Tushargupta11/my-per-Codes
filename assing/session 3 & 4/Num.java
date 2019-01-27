import java.util.Scanner;
class Num
 {
 public static void main (String args[])  
 { 
  System.out.println("To check four digit sum");
  System.out.println("enter any four digit number:");
  
  int x,sum=0;
  Scanner sc = new Scanner(System.in);
  x = sc.nextInt();
  sum = (x/1000)+(x/100)%10 + (x/10)%10 + x%10;
 
	/* (x/1000) will take 1st digit  ,
	   (x/100)%10 will take 2nd digit , 
	   (x/10)%10 will take 3rd digit
	   (x%10) will take 4th digit    */

  System.out.println("  ");
  System.out.println("  ");
  System.out.println("Sum of 4-digit number is:" +sum);
 }
 }
   