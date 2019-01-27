import java.awt.*;
import javax.swing.*;

class TabbedTest
{
	JFrame jf;
	
	public TabbedTest()
	{
		jf=new JFrame();
		jf.setLayout(null);
		
		JTextArea ta=new JTextArea(100, 100);
		ta.setEditable(true);
		
		JPanel p1=new JPanel();
		p1.add(ta);
		JPanel p2=new JPanel();
		p2.add(new JButton("Add"));
		JPanel p3=new JPanel();
		p3.add(new Checkbox("Cricket"));
		p3.add(new Checkbox("Hockey"));
		
		p3.setToolTipText("This is Panel 3 Design Part");
		
		JTabbedPane tp=new JTabbedPane();
		tp.setBounds(30, 70, 400, 300);
		
		tp.add("Course", p1);
		tp.add("Branch", p2);
		tp.add("Subject", p3);
		
		jf.add(tp);
		jf.setSize(500, 500);
		jf.setVisible(true);
	}
}
public class JTabbedPaneTest 
{
	public static void main(String[] args) 
	{
		TabbedTest tt=new TabbedTest();
	}
}