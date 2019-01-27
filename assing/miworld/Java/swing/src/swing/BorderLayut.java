package swing;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayut extends JFrame{

JButton buttons;
	public BorderLayut() {
		// TODO Auto-generated constructor stub
	
	      
		buttons = new JButton[5];
		for (int i = 0;i<5;i++) 
		{  
			buttons[i] = new JButton ("Button " + (i + 1));  
			add (buttons[i]);  
		}
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));  
		setSize(400,400);
		setVisible(true); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new BorderLayout();
	}

}
