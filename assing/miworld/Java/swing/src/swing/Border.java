package swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border {
JFrame f;
	public Border() {
		// TODO Auto-generated constructor stub
		f=new JFrame();  
	      
		JButton b1=new JButton("NORTH");  
		JButton b2=new JButton("SOUTH"); 
		JButton b3=new JButton("EAST"); 
		JButton b4=new JButton("WEST"); 
		JButton b5=new JButton("CENTER"); 
		
      
		f.add(b1,BorderLayout.NORTH);  
		f.add(b2,BorderLayout.SOUTH);  
		f.add(b3,BorderLayout.EAST);  
		f.add(b4,BorderLayout.WEST);  
		f.add(b5,BorderLayout.CENTER);  
		
     
		f.setSize(300,300);  
		 //f.setLayout(new BorderLayout());
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Border();
	}

}
