import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
        <applet code="Demo12" width=400 height=400></applet>
*/

public class Demo12 extends Applet implements ItemListener
{
        Panel p;
        Label l;
        Choice ch;
        List lst;
        Checkbox c1,c2,c3;
        String s[]={"s","a","g","a","r"};

        public void init()
        {
                p=new Panel();
                l=new Label();

                c1=new Checkbox("Marathi");
                c2=new Checkbox("Hindi");
                c3=new Checkbox("English");

                c1.addItemListener(this);
                c2.addItemListener(this);
                c3.addItemListener(this);

                ch=new Choice();
                for(int i=0;i<s.length;i++)
                {
                        ch.add(s[i]);
                }

                lst=new List();
                for(int i=0;i<s.length;i++)
                {
                        lst.add(s[i]);
                }

                ch.addItemListener(this);
                lst.addItemListener(this);

                p.add(c1);
                p.add(c2);
                p.add(c3);
                p.add(ch);
                p.add(lst);

                setLayout(new BorderLayout());

                add("Center",p);
                add("South",l);



        }

        public void itemStateChanged(ItemEvent ie)
        {
                String lng="";

                if(ie.getSource()==ch)
                {
                        l.setText(ch.getSelectedItem());
                }
                else if(ie.getSource()==lst)
                {
                        l.setText(lst.getSelectedItem());
                }
                else
                {
                        if(c1.getState())
                        {
                                lng=lng+ c1.getLabel();
                        }
                        if(c2.getState())
                        {
                                lng=lng+ c2.getLabel();
                        }
                        if(c3.getState())
                        {
                                lng=lng+ c3.getLabel();
                        }

                        l.setText(lng);
                }

        }
}

