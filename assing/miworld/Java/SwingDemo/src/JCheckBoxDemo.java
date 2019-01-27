import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JCheckBoxDemo 
{
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("Checkbox Demo");
		
		JCheckBox jCricket=new JCheckBox("Cricket");
		JCheckBox jFootball=new JCheckBox("Football");
		JCheckBox jVolleyball=new JCheckBox("Volleyball");
		JButton btn=new JButton("Select");
		
		frame.setLayout(new FlowLayout());
		
		frame.add(jCricket);
		frame.add(jFootball);
		frame.add(jVolleyball);
		frame.add(btn);
		
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(jCricket.isSelected()==true)
				{
					JOptionPane.showMessageDialog(null, "You Clicked:"+jVolleyball.getLabel()+" "+jCricket.getLabel()+""+jFootball.getLabel() );
				
				
				}
			}
		});
	}
}