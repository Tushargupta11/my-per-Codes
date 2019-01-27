import java.util.Scanner;
class Prime
 {
  public static void main (String args[]) 
  {
   Scanner sc = new Scanner(System.in);
   int num,i,count=0;
   System.out.print("enter no. to check prime or not: " );
   num = sc.nextInt();
   for(i=1;i<=num;i++)
   {
    if(num%i==0)
     { 
      count++;
     }
    }
     if(count==2)
	{
        System.out.println("number is prime: " +num);
  	}
	else 
	{
        System.out.println("number is not prime: " +num);
	}
  }
 }