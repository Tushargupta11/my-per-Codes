import java.awt.event.*;
import javax.swing.*;

class JComboDemo extends JFrame
{
	JComboBox<String> jcb;
	public JComboDemo()
	{
		setLayout(null);
		
		jcb=new JComboBox<String>();
		
		jcb.addItem("--SELECT Course--");
		jcb.addItem("Android");
		jcb.addItem("Java");
		jcb.addItem("PHP");
		jcb.addItem("BootStrap");
		
		add(jcb);
		
		jcb.setBounds(50, 50, 200, 25);
		
		jcb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				JOptionPane.showMessageDialog(null, "You Selected:"+jcb.getSelectedItem().toString());
			}
		});
		
		setSize(500, 500);
		setVisible(true);
		setResizable(false);
	}
}

public class JComboTest {
	public static void main(String[] args) {
		JComboDemo jcd=new JComboDemo();
	}
}