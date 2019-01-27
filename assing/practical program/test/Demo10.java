import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
        <applet code="Demo10" width=400 height=400>

        </applet>
*/

public class Demo10 extends Applet implements ActionListener,AdjustmentListener
{
        Panel p;
        Label l;
        Button b1,b2;
        Scrollbar s;

        public void init()
        {
                p=new Panel();
                l=new Label();
                b1=new Button("Ok");
                b2=new Button("Cancel");
                s=new Scrollbar(Scrollbar.HORIZONTAL,10,5,0,100);

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
                        l.setText("Ok pressed");
                }
                else if(ae.getSource()==b2)
                {
                        l.setText("Cancel pressed");
                }
        }

        public void adjustmentValueChanged(AdjustmentEvent ae)
        {
                l.setText("Value :" + s.getValue());
        }

}
