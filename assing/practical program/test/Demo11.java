import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
        <applet code="Demo11" width=400 height=400></applet>
*/

public class Demo11 extends Applet implements AdjustmentListener
{
        Panel p1,p2;
        Scrollbar s1,s2,s3;

        Color c;

        public void init()
        {
                p1=new Panel();
                p2=new Panel();

                s1=new Scrollbar(Scrollbar.HORIZONTAL,10,10,0,100);
                s2=new Scrollbar(Scrollbar.HORIZONTAL,10,10,0,100);
                s3=new Scrollbar(Scrollbar.HORIZONTAL,10,10,0,100);

                Color c;

                p2.setLayout(new GridLayout(3,1));

                s1.addAdjustmentListener(this);
                s2.addAdjustmentListener(this);
                s3.addAdjustmentListener(this);

                p2.add(s1);
                p2.add(s2);
                p2.add(s3);

                p1.setBackground(Color.black);
         
                setLayout(new BorderLayout());

                add("Center",p1);
                add("South",p2);                

       }

       public void adjustmentValueChanged(AdjustmentEvent ae)
       {
                int r=s1.getValue();
                int g=s2.getValue();
                int b=s3.getValue();

                c=new Color(r,g,b);

                p1.setBackground(c);
       }
}
