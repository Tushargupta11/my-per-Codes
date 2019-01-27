import java.awt.*;
import java.awt.event.*;

import javax.swing.*;  
  
public class BoxLayoutTest extends JFrame 
{  
	JButton buttons[];  
  
	public BoxLayoutTest() 
	{  
	
		buttons = new JButton [5];
		for (int i = 0;i<5;i++) 
		{  
			buttons[i] = new JButton ("Button " + (i + 1));  
			add (buttons[i]);  
		}
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));  
		setSize(400,400);
		setVisible(true); 
	}	 
	public static void main(String args[])
	{  
		BoxLayoutTest b=new BoxLayoutTest();  
	}  
}  