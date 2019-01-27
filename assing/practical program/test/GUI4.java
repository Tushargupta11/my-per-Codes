import java.awt.*;
import java.applet.*;

/*
        <applet code="GUI4" width=800 height=600>

        </applet>
*/

public class GUI4 extends Applet
{
        Checkbox c1,c2,c3,c4,c5;
        CheckboxGroup cbg;
        Choice ch;
        List lst;
        Panel p;
        Scrollbar sb;

        String s[]={"Sangli","Satara","Solapur","Kolhapur","Pune"};

        public void init()
        {
                c1=new Checkbox("Marathi",true);
                c2=new Checkbox("Hindi");
                c3=new Checkbox("English");

                cbg=new CheckboxGroup();

                c4=new Checkbox("Male",cbg,false);
                c5=new Checkbox("Female",cbg,false);

                lst=new List(3,true);
                for(int i=0;i<s.length;i++)
                {
                        lst.add(s[i]);
                }

                ch=new Choice();
                for(int i=0;i<s.length;i++)
                {
                        ch.add(s[i]);
                }


                sb=new Scrollbar(Scrollbar.HORIZONTAL,10,10,10,100);

                p=new Panel();

                add(c1);
                add(c2);
                add(c3);

                p.add(c4);
                p.add(c5);
                p.add(sb);

                add(lst);
                add(ch);
        }
}
