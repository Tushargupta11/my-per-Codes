import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
        <applet code="ListEvent1" width=400 height=400>

        </applet>
*/

public class ListEvent1 extends Applet implements ItemListener
{
        Panel p;
        Label l;
        List lst;

        String s[]={"Sangli","Kolhapur","Satara","Solapur","Pune"};

        public void init()
        {
                p=new Panel();
                l=new Label();
                lst=new List();

                for(int i=0;i<s.length;i++)
                {
                        lst.add(s[i]);
                }

                lst.addItemListener(this);

                p.add(lst);

                setLayout(new BorderLayout());

                add("Center",p);
                add("South",l);
        }

        public void itemStateChanged(ItemEvent ie)
        {
                l.setText(lst.getSelectedItem());
        }
}
