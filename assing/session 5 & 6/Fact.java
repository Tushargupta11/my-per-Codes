import java.util.Scanner;
class Fact
{  
 public static void main(String args[])
 {  
  int i,fact=1;  
  int number;
 Scanner sc = new Scanner(System.in); 
 System.out.print("enter value: ");
 number= sc.nextInt();  
  for(i=1;i<=number;i++)
   {    
      fact=fact*i;    
   }    
   System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  