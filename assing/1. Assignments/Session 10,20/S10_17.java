import java.util.Scanner;
class Worker
{
  String name;
  int salary_Rate;
  Worker()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter name");
	  name=sc.nextLine();
	  System.out.println("Enter salary rate");
	  salary_Rate=sc.nextInt();
  }  
  void compay(int h)
  {
	  
  }
}
class DailyWorker extends Worker
{
	  void compay(int h)
      {
		Scanner sc1=new Scanner(System.in);
	    System.out.println("Enter no of days daily worker worked");
	    int nod=sc1.nextInt();
		int pay=salary_Rate*nod;
	    System.out.println("Weekly pay for Daily Worker="+pay);
      }
}
class SalariedWorker extends Worker
{
	  void compay(int h)
      {
	      	  System.out.println("Weekly pay for Salaried Worker="+(h*salary_Rate));
      }
}

class S10_17
{
	public static void main(String args[])
	{
		DailyWorker obj=new DailyWorker();
		obj.compay(40);
		SalariedWorker obj1=new SalariedWorker();
		obj1.compay(40);		
	}
	
	
}