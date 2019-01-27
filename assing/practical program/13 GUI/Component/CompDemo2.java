						                        /*Example of Grid Layout */


import java.awt.*;
import java.applet.*;

/*
        <applet code="CompDemo2" width=400 height=400>

        </applet>
*/

public class CompDemo2 extends Applet
{
        Button b[];                                          //array of button

        public void init()
        {
                setLayout(new GridLayout(3,3,20,20));       //20,20 for horizontal & vertical spacing

                b=new Button[9];

                for(int i=0;i<9;i++)
                {
                        b[i]=new Button(String.valueOf(i+1));

                        b[i].setFont(new Font("Times New Roman",Font.ITALIC+Font.BOLD,14));

                        b[i].setBackground(Color.red);

                        add(b[i]);
                }
        }
}
