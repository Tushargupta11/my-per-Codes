import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
        <applet code="ListEvent2" width=400 height=400>

        </applet>
*/

public class ListEvent2 extends Applet implements ItemListener
{
        List os,browser;

        String msg=" ";

        public void init()
        {
                os=new List();
                browser=new List();

                os.add("Windows 98/XP");
                os.add("Windows NT/2000");
                os.add("Solaris");
                os.add("MacOs");

                browser.add("Netscape");
                browser.add("Internet Explorer");
                browser.add("Lynx 2.4");

                os.addItemListener(this);
                browser.addItemListener(this);

                add(os);
                add(browser);
        }

        public void itemStateChanged(ItemEvent ie)
        {
                repaint();
        }

        public void paint(Graphics g)
        {
                msg = "Current OS :";
                msg += os.getSelectedItem();
                g.drawString(msg,6,100);

                msg = "Current Browser :";
                msg += browser.getSelectedItem();
                g.drawString(msg,6,120);

        }
}
