import java.util.Scanner;
class Student
{
 String name[]=new String[5];
 int age[]=new int[5];
 Scanner sc=new Scanner(System.in);
 void input()
  {
   System.out.print("Enter the details of five student..");
   for(int i=0;i<5;i++)
   {
    System.out.print("\nEnter the name of the student..");
    name[i]=sc.next();
    System.out.print("\nEnter the age...");
    age[i]=sc.nextInt();
   }
  }
 void printDetails()
   {
    System.out.print("\nThe details of the student is...");
    for(int i=0;i<5;i++)
    {
     System.out.print("\nName : "+name[i]+" Age : "+age[i]);
    }
   }
}
class StudentDetails extends Student
{
 double avg;
 void returnAvgAge()
   {
    int sage=0;
    for(int i=0;i<5;i++)
    {
     sage=sage+age[i];
    }
    avg=sage/5;
   System.out.print("\nAverage ="+avg);
   }
 void ageLessThanAvg()
   {
    int count=0;
    System.out.print("\n\n\n");
    for(int i=0;i<5;i++)
    {
     if(age[i]<avg)
     {
     System.out.print("Name : "+name[i]+" Age : "+age[i]);
     count++;
     }
    }
    if(count==0)
    {
     System.out.print("\nNot Applicable");
    }
   }
 public static void main(String args[])
 {
  StudentDetails s=new StudentDetails();
  s.input();
  s.printDetails();
  s.returnAvgAge();
  s.ageLessThanAvg();
 }
}