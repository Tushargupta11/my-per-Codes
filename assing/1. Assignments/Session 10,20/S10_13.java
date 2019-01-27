import java.util.Scanner;
class Account
{
	static String name,address,toa;
	static double accountNum,initAmt;
	Account()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Account Holder");
		name=sc.nextLine();
	
		System.out.println("Enter Account Number");
		accountNum=sc.nextDouble();	

		System.out.println("Enter Initial Amount");
		initAmt=sc.nextDouble();
	} 
	Account(int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Account Holder");
		name=sc.nextLine();
	
		System.out.println("Enter Account Number");
		accountNum=sc.nextDouble();	

		System.out.println("Enter Initial Amount");
		initAmt=sc.nextDouble();
		
		System.out.println("Enter address Account Holder");
		address=sc.nextLine();
		
		System.out.println("Enter type of Account");
		toa=sc.nextLine();
		
		System.out.println("Enter operation you want to perform\n1.Deposit\n2.Withdraw\n3.Get balance");	
		Scanner sc1=new Scanner(System.in);
		int n1=sc1.nextInt();
		switch(n)
		{
			case 1:
		    {
			Deposit();
		    break;
		    }
		    case 2:
			{
		    Withdraw();	
	        break;
			}
			case 3:
			{
			Get_Balance();	
			break;
		    }
			default:
			System.out.println("Enter valid option");
        }
	} 
	static void Deposit()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Amount to be deposited");
		double amt=sc2.nextDouble();	
		initAmt=initAmt+amt;
	}
	static void Withdraw()
	{	
		Scanner sc3=new Scanner(System.in);	
	    System.out.println("Enter Amount to be withdrawn");
		double amt=sc3.nextDouble();	
		initAmt=initAmt-amt;	
	}
	static void Get_Balance()
	{
			System.out.println("Balance="+initAmt);
	}

}

class S10_13
{
	public static void main(String []ar)
	{
		
	    System.out.println("Enter Type of Account\n1.Simple\n2.Complex");	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
		    {
			Account e1=new Account();
		    break;
		    }
		    case 2:
			{
		    Account e2=new Account(5);	
	        break;
			}
			default :
			System.out.println("Enter valid option");
        }
	}
}