import java.awt.*;
import java.applet.*;

/*
        <applet code="Demo7" width=400 height=400>

        </applet>
*/

public class Demo7 extends Applet
{
        Button b[];

        public void init()
        {
                setLayout(new GridLayout(3,3,20,20));

                b=new Button[9];

                for(int i=0;i<9;i++)
                {
                        b[i]=new Button(String.valueOf(i+1));
                        add(b[i]);
                }
        }
}
             
