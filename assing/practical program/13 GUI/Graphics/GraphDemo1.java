import java.awt.*;
import java.applet.*;


/* <applet code="GraphDemo" width="400" height="400">
   </applet>
*/



public class GraphDemo extends Applet
{
 public void paint(Graphics g)
{
     //   g.drawString("AMOL CHAVAN",100,100);

    //    g.drawLine(60,60,100,100);

    //    g.drawRect(40,60,100,100);

   //     g.drawRoundRect(40,40,30,28,50,60);
   //     g.fillRoundRect(40,40,30,25,50,60);

   //     g.drawOval(50,80,40,40);
   //     g.fillOval(50,80,40,40);

  /*      int x[]={300,200,400};
        int y[]={100,300,300};
        g.drawPolygon(x,y,3);
        g.fillPolygon(x,y,3);
  */
        g.drawArc(50,50,40,40,30,90);
        g.fillArc(50,50,40,40,30,90);
 
        }
}
