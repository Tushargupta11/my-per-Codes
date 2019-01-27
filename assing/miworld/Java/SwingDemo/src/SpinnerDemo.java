import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class SpinnerDemo
{  
    public static void main(String[] args) 
    {    
    	JFrame f=new JFrame("Spinner Demo");    
    	JLabel label = new JLabel("Spinner Example");         
    	
        label.setHorizontalAlignment(JLabel.RIGHT);   
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        label.setForeground(Color.green);
        
        label.setToolTipText("Hello");
        label.setSize(500,100);    
      
        SpinnerModel value=new SpinnerNumberModel(1,2,10,1);
        JSpinner spinner = new JSpinner(value);   
        spinner.setBounds(100,100,50,30);  
        
        f.add(spinner);  
        f.add(label);
        f.setSize(500,500);   
        f.setLayout(null);   
        f.setVisible(true);     
           
        spinner.addChangeListener(new ChangeListener() {  
        	public void stateChanged(ChangeEvent e) 
        	{  
        		label.setText("Current Value : " + (spinner.getValue()));
        	}  
        });  
    }  
}