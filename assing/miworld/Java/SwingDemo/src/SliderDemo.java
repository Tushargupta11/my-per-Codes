import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo extends JFrame
{  
	public SliderDemo() 
	{  
		JSlider js = new JSlider(JSlider.VERTICAL, 10, 100, 50);  
		
		js.setMinorTickSpacing(10);  
		js.setMajorTickSpacing(10);  
		js.setPaintTicks(true);  
		js.setPaintLabels(true);  
  
		JPanel panel=new JPanel();  
		panel.add(js);
		add(panel);
		
		js.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent ce) {
				JOptionPane.showMessageDialog(null, "Value="+js.getValue());
			}
		});
	}
	public static void main(String s[]) 
	{  
		SliderDemo sd=new SliderDemo();  
		sd.setSize(500, 500); 
		sd.setVisible(true);  
	}  
}