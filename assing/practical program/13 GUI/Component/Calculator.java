                               /* Application of Calculator */ 


import java.awt.*;
import java.applet.*;

/*
        <applet code="Calculator" width=400 height=400>

        </applet>
*/

public class Calculator extends Applet
{
        Label l1,l2;

        Panel p;

        Button b[];

        String s[]={"7","8","9","/","4","5","6","*","1","2","3","-",".","0","=","+"};

        public void init()
        {
                b=new Button[16];

                p=new Panel();

                p.setLayout(new GridLayout(4,4));

                for(int i=0;i<s.length;i++)
                {
                        b[i]=new Button(s[i]);
                        p.add(b[i]);
                }

                l1=new Label(" ",Label.RIGHT);
                
                l2=new Label("Developed By::Sagar V.Kamble");

                l1.setBackground(Color.lightGray);
                l2.setFont(new Font("Times New Roman",Font.ITALIC+Font.BOLD,12));
                l2.setForeground(Color.red);

                setLayout(new BorderLayout());

                add("North",l1);
                add("Center",p);
                add("South",l2);
        }
}
