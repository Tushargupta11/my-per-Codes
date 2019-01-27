import java.awt.*;
import java.applet.*;

/*

<applet code="GraphDemo" width="400" height="400">

</applet>

*/


class GraphDemo extends Applet
{
        Image im;

        public void init()
        {
                im=getImage(getCodeBase(),"raje.jpg");        
        }

        public void print(Graphics g)
        {
                Font f=new Font("Arial",Font.BOLD,20);

                g.setColor(Color.red);
                g.setFont(f);
                g.drawString("Sagar",100,100) ;

                g.drawImage(im,10,10,100,100,this);
        }
}
