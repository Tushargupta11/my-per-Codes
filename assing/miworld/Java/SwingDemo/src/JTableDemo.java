import javax.swing.*;

class JTableTest extends JFrame
{
	public JTableTest()
	{
		String rec[][]={
							{"1001", "Rohit Kumar", "Ravi Kumar"},
							{"1002", "Ramesh Kumar", "Rajan"},
							{"1003", "Mahesh Kumar", "Manish Kumar"},
							{"1004", "Ravi Raj", "Rohan Kumar"}
					    };
		String col[]={"Eno", "Name", "FName"};
		JTable jt=new JTable(rec, col);
		jt.setBounds(50, 40, 200, 300);
		JScrollPane sp=new JScrollPane(jt);
		
		add(sp);
		setSize(400, 400);
		setVisible(true);
	}
}
public class JTableDemo 
{
	public static void main(String[] args) 
	{
		JTableTest tt=new JTableTest();
	}
}