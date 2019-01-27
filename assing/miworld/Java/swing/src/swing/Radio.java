package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Radio extends JFrame implements ActionListener{

	public Radio() {
		// TODO Auto-generated constructor stub
		  JRadioButton jcb = new JRadioButton("A");//creating JRadioButton.  
		  add(jcb);			//adding JRadioButton to frame. 
		  jcb = new JRadioButton("B");	//creating JRadioButton. 
		  add(jcb);			//adding JRadioButton to frame. 
		  jcb = new JRadioButton("C");	//creating JRadioButton.  
		  add(jcb);			//adding JRadioButton to frame. 
		  jcb = new JRadioButton("none");
		  add(jcb);
		  setLayout(new FlowLayout());
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setSize(400, 400);
		  setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Radio();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
