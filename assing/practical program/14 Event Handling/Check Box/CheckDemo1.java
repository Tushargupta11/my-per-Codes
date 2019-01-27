import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
        <applet code="CheckDemo1" width=400 height=400>

        </applet>
*/

public class CheckDemo1 extends Applet implements ItemListener
{
        Panel p;                                                
        Label l;
        Checkbox c1,c2,c3;

        public void init()
        {
                p=new Panel();
                l=new Label();
                c1=new Checkbox("Marathi",true);
                c2=new Checkbox("Hindi");
                c3=new Checkbox("English");

                c1.addItemListener(this);
                c2.addItemListener(this);
                c3.addItemListener(this);

                p.add(c1);
                p.add(c2);
                p.add(c3);

                setLayout(new BorderLayout());

                add("Center",p);
                add("South",l);
        }

        public void itemStateChanged(ItemEvent ie)
        {
                String lng="";

                if(c1.getState())
                {
                        lng=lng + c1.getLabel();
                }
                if(c2.getState())
                {
                        lng=lng + c2.getLabel();
                }
                if(c3.getState())
                {
                        lng=lng + c3.getLabel();
                }
                l.setText("Languages Known :" + lng);
        }
}
