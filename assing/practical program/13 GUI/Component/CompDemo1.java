							/*  Demo of CheckBox,List,Choice,Scrollbar,Panel  */

import java.awt.*;
import java.applet.*;

/*
    <applet code="CompDemo1" width="800" height="400">

    </applet>
*/

public class CompDemo1 extends Applet
{
        Checkbox c1,c2,c3,c4,c5;
        CheckboxGroup g;
        Choice ch;
        List lst;
        Scrollbar sb;
        Panel p;

        String s[]={"Sangli","Kolhapur","Satara","Solapur","Pune"};

        public void init()
        {
                c1=new Checkbox("English",false);
                c2=new Checkbox("Marathi",true);
                c3=new Checkbox("Hindi",true);

                g=new CheckboxGroup();

                c4=new Checkbox("Male",g,false)		;
                c5=new Checkbox("Female",g,false);	

                ch=new Choice();

                lst=new List(3,true);

                for(int i=0;i<s.length;i++)
                {
                        ch.add(s[i]);
                        lst.add(s[i]);
                }

                sb=new Scrollbar(Scrollbar.HORIZONTAL,8,0,0,100);

                p=new Panel();

                p.setBackground(Color.cyan);

                add(c1);
                add(c2);
                add(c3);

                p.add(c4);
                p.add(c5);
                add(p);

                add(ch);
                add(lst);
                add(sb);
        }
}
