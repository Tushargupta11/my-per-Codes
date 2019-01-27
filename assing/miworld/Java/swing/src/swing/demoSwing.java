package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class demoSwing {
JFrame f;
JButton b;
	public demoSwing() {
		// TODO Auto-generated constructor stub
		f=new JFrame("my frame");
		b=new JButton("Submit");
		
		b.setBounds(40, 50, 100, 40);
		f.add(b);
		
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new demoSwing();
	}

}
