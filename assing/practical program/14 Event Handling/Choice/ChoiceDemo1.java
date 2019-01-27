import java.awt.*;
import java.applet.*;
import java.awt.event.*;
                               
/*
        <applet code="ChoiceDemo1" width=400 height=400>

        </applet>
*/

public class ChoiceDemo1 extends Applet implements ItemListener
{
        Panel p;
        Label l;
        Choice ch;

        String s[]={"Sangli","Kolhapur","Satara","Solapur","Pune"};

        public void init()
        {
                p=new Panel();
                l=new Label();
                ch=new Choice();

                for(int i=0;i<s.length;i++)
                {
                        ch.add(s[i]);
                }

                ch.addItemListener(this);

                p.add(ch);

                setLayout(new BorderLayout());

                add("Center",p);
                add("South",l);
        }

        public void itemStateChanged(ItemEvent ie)
        {
                if(ie.getSource()==ch)
                {
                        l.setText(ch.getSelectedItem());
                }
        }
}

