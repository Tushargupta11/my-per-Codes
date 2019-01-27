import java.util.Scanner;
class Marks
{
  public static void main(String args[])
  {
   double m1,m2,m3,m4,m5,sum,per;
   String name,grade;
   int roll; 
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Name");
   name=sc.next();
   System.out.println("Enter the roll number");
   roll=sc.nextInt();
   System.out.println("Enter the marks of five subjects");
   m1=sc.nextDouble();
   m2=sc.nextDouble();
   m3=sc.nextDouble();
   m4=sc.nextDouble();
   m5=sc.nextDouble();
   sum=(m1+m2+m3+m4+m5);
   per=(sum/500)*100;
   if(per>=75)
   {
    grade="A";
   }
   else if(per>=60 && per<75)
   {
    grade="B";
   }
   else if(per>=50 && per<60)
   {
    grade="C";
   }
   else if(per>=40 && per<50)
   {
    grade="D";
   }
   else
   {
    grade="fail";
   }
   System.out.println("Name :"+name);
   System.out.println("Roll :"+roll);
   System.out.println("Total Marks :"+sum);
   System.out.println("Percentage :"+per);
   System.out.println("Grade :"+grade);
  }
}