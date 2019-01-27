import javax.swing.*;  
import javax.swing.text.StyledEditorKit.BoldAction;

import java.awt.*;  
import java.awt.event.*;  

public class JColorChooserTest extends JFrame implements ActionListener
{  
	JFrame frame;  
	JButton btn;  
	JTextArea ta;  
	
	JColorChooserTest()
	{  
		frame=new JFrame("Swing Color Chooser");  
		btn=new JButton("Color");  
		
		btn.setBounds(300,200,100,25);  
		ta=new JTextArea(""); 
		ta.setForeground(Color.RED);
		ta.setFont(new Font(Font.SERIF, Font.BOLD, 25));
		ta.setFont(new Font("Arial", Font.BOLD, 25));
		ta.setBounds(10,10,250,250);
		
		btn.addActionListener(this);
		
		frame.setLayout(null);
		frame.add(btn);
		frame.add(ta);  
		
		frame.setSize(500,500);  
		frame.setVisible(true);  
	}  
	public void actionPerformed(ActionEvent e)
	{  //JOptionPane.showOptionDialog(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
		if(e.getSource()==btn){
		Color color=JColorChooser.showDialog(this,"Choose Color",Color.blue);  
		ta.setBackground(color);  }
	}  
	public static void main(String[] args) 
	{  
	new JColorChooserTest();  
	}
}