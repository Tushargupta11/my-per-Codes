import java.awt.*;
import java.applet.*;

/*
        <applet code="GUI2" width=400 height=400>

        </applet>
*/

public class GUI2 extends Applet
{
        public void init()
        {
                setBackground(Color.red);
                setFont(new Font("Times New Roman",Font.BOLD,35));
        }

        public void paint(Graphics g)
        {
                g.drawString("Sagar K",200,300);
        }
}
