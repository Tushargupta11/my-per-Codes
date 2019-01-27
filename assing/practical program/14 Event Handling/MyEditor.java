import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyEditor extends Frame implements ActionListener,WindowListener
{
        MenuBar mb;
        Menu m1,m2;
        Menu c1,c2;
        MenuItem i1,i2,i3,i4,i5,i6,i7;
        TextArea ta;
        Label l;

        public MyEditor()
        {
                setSize(800,600);

                mb=new MenuBar();

                m1=new Menu("File");
                        i1=new MenuItem("New");
                        i2=new MenuItem("Open");
                        i3=new MenuItem("Save");
                       
                        i1.addActionListener(this);
                        i2.addActionListener(this);
                        i3.addActionListener(this);
                       
                        m1.add(i1);
                        m1.add(i2);
                        m1.add(i3);
                       
               m2=new Menu("Color");

                        c1=new Menu("BackGround");
                                i4=new MenuItem("Cyan");
                                i5=new MenuItem("Light Gray");

                                i4.addActionListener(this);
                                i5.addActionListener(this);

                                c1.add(i4);
                                c1.add(i5);

                        c2=new Menu("ForeGround");
                                i6=new MenuItem("Red");
                                i7=new MenuItem("Green");

                                i6.addActionListener(this);
                                i7.addActionListener(this);

                                c2.add(i6);
                                c2.add(i7);

                        m2.add(c1);
                        m2.add(c2);


               mb.add(m1);
               mb.add(m2);


               ta=new TextArea("",10,20,TextArea.SCROLLBARS_BOTH);

               l=new Label();

               setLayout(new BorderLayout());

               add("Center",ta);
               add("South",l);

               setMenuBar(mb);

               addWindowListener(this);

               setVisible(true);
        }


        public void actionPerformed(ActionEvent ae)
        {
                if(ae.getSource()==i1)
                {
                        l.setText("New menu selected ");

                        ta.setText("");
                        ta.requestFocus();
                }
                else if(ae.getSource()==i2)
                {
                        String fnm;
                        int ch;
                        String data=" ";

                        FileDialog fd;

                        fd=new FileDialog(new Frame(),"My Editor",FileDialog.LOAD);
                        fd.setVisible(true);

                        fnm=fd.getDirectory() + "\\" + fd.getFile();

                        l.setText(fnm);

                        try
                        {
                                FileInputStream fis=new FileInputStream(fnm);

                                while((ch=fis.read())!=-1)
                                {
                                        data=data+(char)ch;
                                }
                                fis.close();

                                ta.setText(data);
                        }
                        catch(Exception e)
                        {

                        }


                }

  /*              else if(ae.getSource()==i3)
                {
                        int ch;
                        String fnm="Saggy";

                        FileDialog fd;

                        fd=new FileDialog(new Frame(),"My Editor",FileDialog.SAVE);
                        fd.setVisible(true);

                        try
                        {
                                FileOutputStream fos=new FileOutputStream(fnm);

                                while((ch=System.in.read())!=-1)
                                {
                                        fos.write(ch);
                                }
                                fos.close();
                        }
                        catch(Exception e)
                        {

                        }
                }
  */       
                else
                {
                        if(ae.getSource()==i4)
                        {
                                ta.setBackground(Color.cyan);
                        }

                        if(ae.getSource()==i5)
                        {
                                ta.setBackground(Color.lightGray);
                        }

                        if(ae.getSource()==i6)
                        {
                                ta.setForeground(Color.red);
                        }

                        if(ae.getSource()==i7)
                        {
                                ta.setForeground(Color.green);
                        }

                }
        }
        public void windowOpened(WindowEvent we){}
        public void windowClosed(WindowEvent we){}
        public void windowActivated(WindowEvent we){}
        public void windowDeactivated(WindowEvent we){}
        public void windowIconified(WindowEvent we){}
        public void windowDeiconified(WindowEvent we){}

        public void windowClosing(WindowEvent we)
        {
                System.exit(0);
        }

        public static void main(String args[])
        {
                MyEditor me=new MyEditor();
        }
}
