                                /* Demo of Status Bar */

import java.awt.*;
import java.applet.*;

/*
        <applet code="StatusBar" width=400 height=400>

        </applet>
*/

public class StatusBar extends Applet
{
        public void init()
        {
                setBackground(Color.lightGray);
                setFont(new Font("Times New Roman",Font.ITALIC+Font.BOLD,16));
        }

        public void paint(Graphics g)
        {
                g.drawString("Sagar V.Kamble",40,40);
                showStatus("Developed By::Sagar K.");           //set status bar
        }
}
