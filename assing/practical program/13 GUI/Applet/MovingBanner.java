                                /* Application of Moving Banner */


import java.awt.*;
import java.applet.*;

/*
        <applet code="MovingBanner" width=400 height=400>

        </applet>
*/

public class MovingBanner extends Applet implements Runnable
{
        String msg=" Sagar V. Kamble ";

        Thread t=null;                             //set obj of Thread to null

        boolean stopFlag;                          //for "stop" method

        public void init()                         //initiallization
        {
                setBackground(Color.lightGray);
        }

        public void start()
        {
                t=new Thread(this);                //tread start
                stopFlag=false;
                t.start();
        }

        public void run()
        {
                char ch;

                for( ; ; )                         //endless loop
                {
                        try
                        {
                                repaint();        //make every updation in window

                                Thread.sleep(250);
                                ch=msg.charAt(0);
                                msg=msg.substring(1,msg.length());
                                msg+=ch;

                                if(stopFlag)
                                        break;

                        }
                        catch(Exception e)
                        {
                                System.out.println("Exception :" + e);
                        }
                }
        }

        public void stop()
        {
                stopFlag=true;
                t=null;                            //obj set to null after stop thred
        }

        public void paint(Graphics g)
        {
                g.drawString(msg,40,40);
                showStatus("Developed By::Sagar K.");      //status bar
        }
}
