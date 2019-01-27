package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyTextfield extends JFrame{

	 public MyTextfield() 
	 {
	  JTextField jtf = new JTextField(20);	//creating JTextField. 
	  add(jtf);				//adding JTextField to frame. 
	  setLayout(new FlowLayout());
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setSize(400, 400);
	  setVisible(true);
	 }
	 public static void main(String[] args) 
	 {
	  new MyTextfield();


	}

}
