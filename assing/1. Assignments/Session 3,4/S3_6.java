import java.util.Scanner;
 class S3_6
 {    
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n;
       System.out.println("Enter a year to check whether it's Leap year or not");   
     n=sc.nextInt();
     int y;
     y=(n%4==0)?((n%100==0)?((n%400==0)?0:1):1):1;
     if(y==0)
     System.out.println("Leap year");
     else
     System.out.println("not Leap year");
    }
 }