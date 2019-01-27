package balance;
public class Account
{
	int bal=2000;
	void displayBalance()
	{
		System.out.println("Balance="+bal);
	}
}
import balance;
class S10_19
{
    public static void main(String args[])
	{
	    Account s=new Account();
		s.displayBalance();
	}
}