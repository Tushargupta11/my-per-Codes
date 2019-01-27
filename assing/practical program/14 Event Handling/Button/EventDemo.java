
				/* Demo of ActionListener event */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
        <applet code="EventDemo" width=400 height=400>

        </applet>
*/

public class EventDemo extends Applet implements ActionListener
{
        Button b1,b2;
        Panel p;
        Label l;

        public void init()
        {
                p=new Panel();
                l=new Label();
                b1=new Button("Ok");
                b2=new Button("Cancel");

                b1.addActionListener(this);
                b2.addActionListener(this);

                p.add(b1);
                p.add(b2);

                setLayout(new BorderLayout());

                add("Center",p);
                add("South",l);
        }

        public void actionPerformed(ActionEvent ae)
        {
                if(ae.getSource()==b1)
                {
                        l.setText("Ok Pressed");
                }
                else if(ae.getSource()==b2)
                {
                        l.setText("Cancel Pressed");
                }
        }
}

