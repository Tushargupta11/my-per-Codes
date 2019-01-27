                               /* Drag on screen using Mouse */ 


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
        <applet code="Demo2" width=400 height=400>

        </applet>
*/

public class Demo2 extends Applet implements MouseListener,MouseMotionListener
{
        Label l;

        int x1,y1,x2,y2;
        boolean flag;                                                

        public void init()
        {
                l=new Label();
                setLayout(new BorderLayout());
                add("South",l);
                addMouseListener(this);
                addMouseMotionListener(this);

                x1=0;
                y1=0;
                x2=0;
                y2=0;

                flag=false;
        }

        public void mouseEntered(MouseEvent me){}
        public void mouseExited(MouseEvent me){}
        public void mouseClicked(MouseEvent me){}

        public void mouseMoved(MouseEvent me)
        {
                l.setText("x=" + me.getX() + "y=" + me.getY());
        }

        public void mousePressed(MouseEvent me)
        {
                x1=me.getX();
                y1=me.getY();                                //set x1,y1 first

                x2=x1;
                y2=y1;                                       //set x2,y2 second

                flag=true;                                   //press the mouse button

                repaint();                                   //call update method

        }                          //if update & paint method r thr,yhen paint() method is called by repaint()


        public void mouseDragged(MouseEvent me)
        {
                x1=x2;
                y1=y2;

                x2=me.getX();
                y2=me.getY();

                repaint();
        }

        public void mouseReleased(MouseEvent me)
        {
                flag=false;                            //release mouse button
        }        

        public void update(Graphics g)
        {
                g.drawLine(x1,y1,x2,y2);
        }

}
