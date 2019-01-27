package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class First 
{
 JFrame jf;
JLabel jl;
JTextField jt;
 
 public First() {
 jf = new JFrame("MyWindow");//Creating a JFrame with name MyWindow.
 JButton btn = new JButton("Say Hello");	//Creating a Button. 
 jl=new JLabel("Enter Details");
 
 jt=new JTextField();
 jt.setSize(200, 200);
 jf.add(jt);
 
 jf.add(jl);
 jf.add(btn);             		//adding button to frame.
 jf.setLayout(new FlowLayout());        //setting layout using FlowLayout object.
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//setting close  operation.
 jf.setSize(400, 400);            	//setting size
 jf.setVisible(true);            	//setting frame visibilty
}
 
 public static void main(String[] args) 
 {
  new First();
 }
}

