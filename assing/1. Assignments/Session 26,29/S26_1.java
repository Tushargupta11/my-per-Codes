package Demo;

class ThreadA implements Runnable
{
 
	@Override
	public void run() {
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method s
		System.out.println("Hey thread is created ");
		
	}
	
}
class S26_1
{
	public static void main(String []a)
	{
		ThreadA t1=new ThreadA();
		Thread t=new Thread(t1);
		t.start();
	}
     	
}