import java.util.Scanner;
class S3_1
{ 
    
 public static void main(String args[])
 { 
   double a,b,c,d,e;
   double avg;
   System.out.println("Enter marks of 5 subjects of a student");
   Scanner sc=new Scanner(System.in);
   a=sc.nextDouble();
   b=sc.nextDouble();
   c=sc.nextDouble();
   d=sc.nextDouble();
   e=sc.nextDouble();
   avg=(a+b+c+d+e)/5.0;
   System.out.println("Total Marks obtained ="+(a+b+c+d+e));
   System.out.println("Percentage obtained ="+avg);
  
 }

}