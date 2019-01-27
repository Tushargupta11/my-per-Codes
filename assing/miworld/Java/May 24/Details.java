import java.util.Scanner;
class StudentDetails
{
 int age[]=new int[5];
 String name[]=new String[5];
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
   double returnAvgAge()
   {
    double avg;
    int sage=0;
    for(int i=0;i<5;i++)
    {
     sage=sage+age[i];
    }
    avg=sage/5;
    return avg;
   }
   void printDetails()
   {
    System.out.print("\nThe details of the student is...");
    for(int i=0;i<5;i++)
    {
     System.out.print("\nName : "+name[i]+" Age : "+age[i]);
    }
   }
   void ageLessThanAvg(double avg)
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

  
}
class Details
{
 public static void main(String args[])
 {
  double avg; 
  StudentDetails s=new StudentDetails();
  s.input();
  s.printDetails();
  avg=s.returnAvgAge();
  System.out.print("\n\nAverage age..."+avg);
  s.ageLessThanAvg(avg);
 } 
}


