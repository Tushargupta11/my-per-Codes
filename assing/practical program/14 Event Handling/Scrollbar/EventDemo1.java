                        /* Demo of AdjustmentListener event */


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
        <applet code="EventDemo1" width=400 height=400>

        </applet>
*/

public class EventDemo1 extends Applet implements ActionListener,AdjustmentListener
{
        Button b1,b2;
        Panel p;
        Label l;
        Scrollbar s;

        public void init()
        {
                p=new Panel();
                l=new Label();
                b1=new Button("Ok");
                b2=new Button("Cancel");
                s=new Scrollbar();

                b1.addActionListener(this);
                b2.addActionListener(this);

                s.addAdjustmentListener(this);

                p.add(b1);
                p.add(b2);
                p.add(s);

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

        public void adjustmentValueChanged(AdjustmentEvent ae)
        {
                l.setText("Value=" + s.getValue());
        }
}
