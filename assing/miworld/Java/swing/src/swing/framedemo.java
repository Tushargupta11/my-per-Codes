package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.sun.prism.Image;

public class framedemo  {
	JFrame f;
JButton b;
JPanel p;

JLabel l;
Image imageOrg = null; 
Image image = null;
//TitledBorder t;

	ImageIcon im=new ImageIcon("Img/picturepuzzle.jpg");
	public framedemo() {
		// TODO Auto-generated constructor stub
		p = new JPanel();
		JLabel pic = new JLabel(new ImageIcon("Img/picturepuzzle.jpg"));
		//p.setBackground(java.awt.Color.RED);
		p.add(pic);
			
		f= new JFrame("My Frame");
		l=new JLabel("helloo");
		l.setBounds(20, 150, 70, 50);
		f.add(l);
		//p=new JPanel
		
		p.setBounds(350, 150, 400, 400);
		  TitledBorder titled = new TitledBorder("Title");
		 p.setBorder(titled);
	//	p.setBorder(BorderFactory.createLineBorder(Color.black));
		//p.setSize(300, 300);
	l.setFont(new Font("Arial", Font.PLAIN,10 ));
	l.setForeground(Color.red);
		f.add(p);
		p.setLayout(null);
		b=new JButton("Submit",im);
		b.setBounds(20, 40, 100, 40);
		f.add(b);
		f.getContentPane().setBackground(Color.cyan);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new framedemo();
	}

}
