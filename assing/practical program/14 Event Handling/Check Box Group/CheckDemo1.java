import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
        <applet code="CheckDemo1" width=250 height=200>

        </applet>
*/

public class CheckDemo1 extends Applet implements ItemListener
{
        String msg=" ";

        Checkbox c1,c2,c3,c4;

        CheckboxGroup cbg;

        public void init()
        {
                cbg=new CheckboxGroup();

                c1=new Checkbox("Windows 98/XP",cbg,true);
                c2=new Checkbox("Windows NT/2000",cbg,false);
                c3=new Checkbox("Solaris",cbg,false);
                c4=new Checkbox("MacOS",cbg,false);

                c1.addItemListener(this);
                c2.addItemListener(this);
                c3.addItemListener(this);
                c4.addItemListener(this);

                add(c1);
                add(c2);
                add(c3);
                add(c4);
        }

        public void itemStateChanged(ItemEvent ie)
        {
                repaint();
        }

        public void paint(Graphics g)
        {
                msg="Current Selection :";

                msg+=cbg.getSelectedCheckbox().getLabel();

                g.drawString(msg,6,100);
        }
}
