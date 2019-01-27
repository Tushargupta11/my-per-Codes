                        /* Display (x,y)co-ords when mouse is moved */


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
        <applet code="Demo1" width=400 height=400>

        </applet>
*/

public class Demo1 extends Applet implements MouseListener,MouseMotionListener
{
        Label l;

        public void init()
        {
                l=new Label();
                setLayout(new BorderLayout());
                add("South",l);
                addMouseListener(this);
                addMouseMotionListener(this);
        }

        public void mousePressed(MouseEvent me){}                  //6 methods must be mentioned
        public void mouseReleased(MouseEvent me){}
        public void mouseEntered(MouseEvent me){}
        public void mouseExited(MouseEvent me){}
        public void mouseClicked(MouseEvent me){}

        public void mouseMoved(MouseEvent me)                      //for mouse moving
        {
                l.setText("x=" + me.getX() + "y=" + me.getY());
        }

        public void mouseDragged(MouseEvent me){}

}       
