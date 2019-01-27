			/* We understand which methods are called when minimise,maximise the applet window */



import java.awt.*;
import java.applet.*;

/*
        <applet code="Sample" width=400 height=400>

        </applet>
*/

public class Sample extends Applet
{
        String msg;

        public void init()                          //initialization done here
        {
                setBackground(Color.cyan);
                setForeground(Color.magenta);
                msg="Inside init()----";
        }

        public void start()                         //applet start here
        {
                msg+="Inside start()----";
        }

        public void paint(Graphics g)               //display her
        {
                msg+="Inside paint()----";
                g.drawString(msg,30,30);
        }
}
