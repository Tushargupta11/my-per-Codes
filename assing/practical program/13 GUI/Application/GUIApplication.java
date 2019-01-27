                        /* GUI Application using Frame */



import java.awt.*;

class GUIApplication extends Frame
{
        public GUIApplication()
        {
                setSize(800,600);                       //size is in pixel(resolution)

                setTitle("My First GUI Application");

                setVisible(true);                      //by default 'visible' property of frame is disable
        }                                              //make it true for 'visible'

        public static void main(String args[])
        {
                GUIApplication g=new GUIApplication();
        }
}


