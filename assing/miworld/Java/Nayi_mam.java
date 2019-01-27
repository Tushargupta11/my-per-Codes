import java.util.Scanner;
class Student
{

    String name[]=new String[20];
    int age[]=new int[5];
    int avg=0;
   Scanner sc1=new Scanner(System.in);  
   void input()
   {
    for(int i=0;i<5;i++)
      {
          System.out.println("Enter the Name and then age of student");
          name[i]=sc1.next();
          age[i]=sc1.nextInt();
      }
   }
   void show()
   {
    System.out.println("Name\tAge");
    for(int i=0;i<5;i++)
      {

          System.out.println(name[i]+"\t"+age[i]);

      }
    }
}
 class StudentDetails extends Student
  {  
  int avgAge()
    {
         int sum=0;
    for(int i=0;i<5;i++)
      {


         sum=sum+age[i];
      }
          avg=sum/5; 
         return avg;
    }
    void ageCriteria()
    {
     int count=0;
     System.out.println("Student having age less then average age are");        
     for(int i=0;i<5;i++)
      {
         if(age[i]<avg)
         {
         System.out.println(name[i]);
          count++;
         } 
      }
         if(count==0)
     System.out.println("Not applicable");   
 }
  public static void main(String args[])
  {        
    StudentDetails s=new StudentDetails();
    s.input();
    s.show();
    int FinalAvg=s.avgAge();
    System.out.println("Average of ages of all the students="+FinalAvg);
    s.ageCriteria();
  }
}
