import java.util.Scanner;
class Call
{
  double duration,charge;
  Call()
  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter duration of call(in seconds)");
	    duration=sc.nextInt(); 
  }
  void charge()
  {
	  
  }
}
class Ordinary extends Call
{
	  void charge()
      {
	    System.out.println("Ordinary call charge= Rs."+(duration*.01));
      }
}
class Urgent extends Call
{
	  void charge()
      {
	    System.out.println("Urgent call charge= Rs."+(duration*.02));
      }
}

class Lightening extends Call
{
	  void charge()
      {
	    System.out.println("Lightening call charge= Rs."+(duration*.05));
      }
}
class S10_18
{
	public static void main(String args[])
	{
		Scanner sc3=new Scanner(System.in);
	    System.out.println("Enter type of call\n1.Urgent\n2.Ordinary\n3.Lightening");
	    int n=sc3.nextInt();
		switch(n)
		{
			case 1:
			{
				Urgent obj1=new Urgent();
				obj1.charge();
				break;
			}
			case 2:
			{
				Ordinary obj2=new Ordinary();
				obj2.charge();
				break;
			}
			case 3:
			{
				Lightening obj3=new Lightening();
				obj3.charge();
				break;
			}
			default:
			{
				System.out.println("Enter valid option");
			}
		}		
	}
	
	
}