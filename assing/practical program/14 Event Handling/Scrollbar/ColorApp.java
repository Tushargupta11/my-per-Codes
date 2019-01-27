                                /* Application of Color Formation */


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
        <applet code="ColorApp" width=400 height=400>

        </applet>
*/

public class ColorApp extends Applet implements AdjustmentListener
{
        Panel p1,p2;
        Scrollbar s1,s2,s3;

        Color c;

        public void init()
        {
                p1=new Panel();
                p2=new Panel();

                p2.setLayout(new GridLayout(3,1));

                s1=new Scrollbar(Scrollbar.HORIZONTAL,8,0,0,100);
                s2=new Scrollbar(Scrollbar.HORIZONTAL,8,0,0,100);
                s3=new Scrollbar(Scrollbar.HORIZONTAL,8,0,0,100);

                s1.addAdjustmentListener(this);
                s2.addAdjustmentListener(this);
                s3.addAdjustmentListener(this);

                p2.add(s1);
                p2.add(s2);
                p2.add(s3);

                c=Color.black;                                 //default color is black

                p1.setBackground(c);

                setLayout(new BorderLayout());

                add("Center",p1);
                add("South",p2);
        }

        public void adjustmentValueChanged(AdjustmentEvent ae)
        {
                int r=s1.getValue();                            //red
                int g=s2.getValue();                            //green
                int b=s3.getValue();                            //blue

                c=new Color(r,g,b);                             //make new color

                p1.setBackground(c);
        }
}
