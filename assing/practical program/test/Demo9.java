import java.awt.*;
import java.applet.*;

/*
        <applet code="Demo9" width=400 height=400>

        </applet>
*/

public class Demo9 extends Applet
{
        Label l;
        Panel p;
        Button b[];
        String s[]={"9","8","7","/","6","5","4","*","3","2","1","-",".","0","+","="};


        public void init()
        {
                p=new Panel();
                b=new Button[16];

                p.setLayout(new GridLayout(4,4));

                for(int i=0;i<s.length;i++)
                {
                        b[i]=new Button(s[i]);
                        p.add(b[i]);
                }

                l=new Label();

                setLayout(new BorderLayout());

                add("North",l);
                add("Center",p);

        
        }

        public void paint(Graphics g)
        {
                showStatus("Developed By : Sagar K");
        }
}
