import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
        <applet code="CheckDemo2" width=250 height=200>

        </applet>
*/

public class CheckDemo2 extends Applet implements ItemListener
{
        String msg=" ";
        Checkbox win98,winNT,solaris,mac;

        public void init()
        {
                win98=new Checkbox("Windows 98/XP",true);
                winNT=new Checkbox("Windows NT/2000");
                solaris=new Checkbox("Solaris");
                mac=new Checkbox("MacOS");

                win98.addItemListener(this);
                winNT.addItemListener(this);
                solaris.addItemListener(this);
                mac.addItemListener(this);

                add(win98);
                add(winNT);
                add(solaris);
                add(mac);
        }

        public void itemStateChanged(ItemEvent ie)
        {
                repaint();
        }

        public void paint(Graphics g)
        {
                msg="Current State :";
                g.drawString(msg,6,80);

                msg="Windows 98/XP :" + win98.getState();
                g.drawString(msg,6,100);

                msg="Windows NT/2000 :" + winNT.getState();
                g.drawString(msg,6,120);

                msg="Solaris :" + solaris.getState();
                g.drawString(msg,6,140);

                msg="MacOS" + mac.getState();
                g.drawString(msg,6,160);
        }
}
