                                                          				    /* Application of Color Formation */


import java.awt.*;
import java.applet.*;

/*
        <applet code="ColorApp" width=400 height=400>

        </applet>
*/

public class ColorApp extends Applet
{
        Panel p1,p2;

        Scrollbar s1,s2,s3;

        public void init()
        {
                p1=new Panel();
                p2=new Panel();

                p2.setLayout(new GridLayout(3,1));

                s1=new Scrollbar(Scrollbar.HORIZONTAL,8,0,0,100);
                s2=new Scrollbar(Scrollbar.HORIZONTAL,8,0,0,100);
                s3=new Scrollbar(Scrollbar.HORIZONTAL,8,0,0,100);

                p2.add(s1);
                p2.add(s2);
                p2.add(s3);

                setLayout(new BorderLayout());

                add("Center",p1);
                add("South",p2);

        }
}
