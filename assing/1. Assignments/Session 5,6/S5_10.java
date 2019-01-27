import java.util.Scanner;
class S5_10
{ 
    
 public static void main(String args[])
 { 
   int a,b,c,d,e;
   int avg;
   System.out.println("Enter marks of 5 subjects of a student");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   d=sc.nextInt();
   e=sc.nextInt();
   avg=(a+b+c+d+e)/5;
   System.out.println("Total Marks obtained ="+(a+b+c+d+e));
   System.out.println("Percentage obtained ="+avg);
   if(avg>74)
   System.out.println("Grade =Honors");
   else if(avg>60&&avg<75)
   System.out.println("Grade =First Division");
   else if(avg>50&&avg<61)
   System.out.println("Grade =Second Division");
   else if(avg>33&&avg<51)
   System.out.println("Grade =Third Division");
   else
   System.out.println("Grade =Fail");
 }

}