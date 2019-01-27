package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.sun.prism.Graphics;

public class buttonswing extends JFrame {
JPanel p;
	public buttonswing() {
		// TODO Auto-generated constructor stub
		  JButton bt1 = new JButton("Yes");//Creating a Yes Button.
		  
		  JButton bt2 = new JButton("No");//Creating a No Button.  
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		 //setting close operation. 
		 p=
		 bt1.setBounds(20, 50, 60, 40); 
		 bt2.setBounds(120, 50, 60, 40); 
		 setLayout(null);	//setting layout using FlowLayout object  
		  setSize(400, 400);	//setting size of Jframe 
		  bt1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		  bt1.setOpaque(false);
		 
		  bt1.setFocusPainted(true);
		  bt1.setBorderPainted(true);
		  bt1.setContentAreaFilled(true);
		//  setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		  
		  add(bt1);		//adding Yes button to frame. 
		  add(bt2);	//addin No button to frame. 
		  //getContentPane().setBackground(Color.black);
		  setVisible(true);

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new buttonswing();
	}

}
