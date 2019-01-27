import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class demo extends JFrame {

JButton b;
JLabel l;
	public demo() {
		// TODO Auto-generated constructor stub
		new JFrame("MyFrame");
		b=new JButton("Submit");
		l=new JLabel("Enter A number");
		add(b);
		add(l);
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo d=new demo();
d.setSize(400,400);
d.setLayout(new FlowLayout());
d.setVisible(true);
	}

}
