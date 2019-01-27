import java.awt.*;
import java.applet.*;

/*

 <applet code="GUIApplet.class" width="400" height="400">

 </applet>

*/

public class GUIApplet extends Applet
{
        public void paint(Graphics g)                             //'print' is method of life cycle of applet program
        {
                g.drawString("My First Applet Program",200,200);
        }
}
