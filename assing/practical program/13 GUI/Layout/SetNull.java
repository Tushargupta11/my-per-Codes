                                /* Create Application Window */


import java.awt.*;
import java.applet.*;
import javax.swing.*;

/*
        <applet code="SetNull" width=400 height=400>

        </applet>
*/

public class SetNull extends Applet
{
        Label l1,l2,l3,l4,l5;
        TextField t1,t2,t3;
        Checkbox c1,c2;
        CheckboxGroup cbg;
        Button b1,b2,b3,b4,b5;
        Choice ch;

        String s[]={"MCA","MBA","MSc.Comp","MSc.Tech"};

        public void init()
        {
                setLayout(null);

                l1=new Label("Enter Name ");
                l1.setBounds(50,50,80,20);                //setBounds(x,y,w,h)

                t1=new TextField();
                t1.setBounds(180,50,140,20);

                l2=new Label("Gender");
                l2.setBounds(50,100,50,20);

                cbg=new CheckboxGroup();

                c1=new Checkbox("Male",cbg,false);
                c1.setBounds(180,100,50,20);

                c2=new Checkbox("Female",cbg,false);
                c2.setBounds(260,100,70,20);

                l3=new Label("DOB");
                l3.setBounds(50,150,50,20);

                t2=new TextField();
                t2.setBounds(180,150,100,20);

                l4=new Label("Course");
                l4.setBounds(50,200,50,20);

                ch=new Choice();
                for(int i=0;i<s.length;i++)
                {
                        ch.add(s[i]);
                }
                ch.setBounds(180,200,100,20);

                l5=new Label("Address");
                l5.setBounds(50,250,80,20);

                t3=new TextField();
                t3.setBounds(180,250,180,20);

                b1=new Button("New");
                b1.setBounds(50,330,50,20);

                b2=new Button("Save");
                b2.setBounds(130,330,50,20);

                b3=new Button("Update");
                b3.setBounds(210,330,50,20);

                b4=new Button("Delete");
                b4.setBounds(290,330,50,20);

                b5=new Button("Exit");
                b5.setBounds(370,330,50,20);

                add(l1);
                add(t1);
                add(l2);
                add(c1);
                add(c2);
                add(l3);
                add(t2);
                add(l4);
                add(ch);
                add(l5);
                add(t3);
                add(b1);
                add(b2);
                add(b3);
                add(b4);
                add(b5);
        }
}
