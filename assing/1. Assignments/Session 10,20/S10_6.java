import java.util.Scanner;

class Date
{
	int day,month,year;
	Date()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day then month followed by year");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		day=p;
		month=q;
		year=r;
	}
   	
}
class Student extends Date
{
    int ID;
    String name;
	Student(int a,String n)
	{
		ID=a;
		name=n;
		
	}
	void showDetail()
	{
		System.out.println("Student Details\nName="+name+"\nID="+ID+"\nDOB="+day+"/"+month+"/"+year);
	}
	
}


class S10_6
{
 public static void main(String [] args)
 {
	    Student obj=new Student(1,"Arpit");		
                    Scanner sc=new Scanner(System.in);	
                    obj.showDetail();		

 
	

 }
}