import javax.swing.*;

class ProgressDemo extends JFrame
{
	JProgressBar jb;

	int j=0, num=0;
	
	public ProgressDemo()
	{
	
		
		jb=new JProgressBar(SwingConstants.HORIZONTAL, 0, 12000);
		jb.setBounds(40, 40, 200, 25);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(300, 300);
		setLayout(null);
	}
	public void showProgress()
	{
		while(j<=12000)
		{	
			jb.setValue(j);
			j+=100;
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class SwingTest 
{
	public static void main(String[] args) 
	{
		ProgressDemo pd=new ProgressDemo();
		pd.setVisible(true);
		pd.showProgress();
	}
}