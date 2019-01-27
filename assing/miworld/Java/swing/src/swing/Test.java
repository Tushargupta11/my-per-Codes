package swing;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Test extends JFrame {
	 String name[] = {"Abhi","Adam","Alex","Ashkay"};  //list of name. 
Butt
	public Test() {
		// TODO Auto-generated constructor stub
		 
		  JComboBox jc = new JComboBox(name);	//initialzing combo box with list of name. 
		  add(jc);				//adding JComboBox to frame. 
		  setLayout(new FlowLayout());
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setSize(400, 400);
		  setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test();
	} 

}
