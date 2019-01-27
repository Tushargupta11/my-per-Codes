import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;  

public class CardLayoutTest extends JFrame implements ActionListener
{  
		CardLayout card;  
		JButton b1,b2,b3;  
		Container c;  
		
		CardLayoutTest()
		{  
			c=getContentPane();  
			card=new CardLayout(50,50);  
			c.setLayout(card);  
          
			b1=new JButton("C++");  
			b2=new JButton("Java");  
			b3=new JButton("Android"); 
        
			b1.addActionListener(this);  
			b2.addActionListener(this);  
			b3.addActionListener(this);  
              
			c.add(b1);
			c.add(b2);
			c.add(b3);                     
		}
	public void actionPerformed(ActionEvent e) 
    {  
    	card.next(c);  
    }  
    public static void main(String[] args) 
    {  
        CardLayoutTest cl=new CardLayoutTest();  
        cl.setSize(400,400);  
        cl.setVisible(true);  
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
}  