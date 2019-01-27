import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyEditor extends Frame implements ActionListener,WindowListener
{

        MenuBar mr;
        Menu m1,m2,m3,m4,m5;
        MenuItem i1,i5;
        MenuItem i2,i6;
        MenuItem i3,i7;
        MenuItem i4,i8,i9,i10;
        TextArea t;
        Label l,l1;


        public void init()
        {

                mr=new MenuBar();
                m1=new Menu("File");
                m2=new Menu("Edit");
                m3=new Menu("View");
                m4=new Menu("Background");
                m5=new Menu("Foreground");

                //m3=new Menu()
                i1=new MenuItem("New");
                i2=new MenuItem("Open");
                i3=new MenuItem("Save");

                i1.addActionListener(this);
                i2.addActionListener(this);
                i3.addActionListener(this);

                m1.add(i1);
                m1.add(i2);
                m1.add(i3);
                mr.add(m1);

                i4=new MenuItem("Cut");
                i5=new MenuItem("Copy");
                i6=new MenuItem("Past");

                i4.addActionListener(this);
                i5.addActionListener(this);
                i6.addActionListener(this);

                m2.add(i4);
                m2.add(i5);
                m2.add(i6);
                mr.add(m2);

                i7=new MenuItem("White");
                i8=new MenuItem("Red");

                i7.addActionListener(this);
                i8.addActionListener(this);

                m4.add(i7);
                m4.add(i8);
                m3.add(m4);
                mr.add(m3);

                i9=new MenuItem("Yellow");
                i10=new MenuItem("Black");

                i9.addActionListener(this);
                i10.addActionListener(this);
                m5.add(i9);
                m5.add(i10);
                m3.add(m5);


                t=new TextArea("",10,20,TextArea.SCROLLBARS_BOTH);
                l=new Label("");
                l1=new Label("Developed By..");
                
                setLayout(new BorderLayout());
                //add("North",l);
                add("Center",t);
                add("South",l1);


                setMenuBar(mr);
                setSize(800,600);


                addWindowListener(this);


                setVisible(true);




        }


        public void actionPerformed(ActionEvent ae)
        {

                if(ae.getSource()==i1)
                {
                        //l1.setText("New Selected");

                    t.setText("");
                    t.requestFocus();

                }

                else if(ae.getSource()==i2)
                {
                        int ch;
                        String data="";


                        FileDialog fd=new FileDialog(new Frame(),"MyEditor",FileDialog.LOAD);
                        fd.setVisible(true);

                        String fnm=fd.getDirectory()+"\\"+fd.getFile();
                        l1.setText(fnm);

                        try
                        {

                                FileInputStream fis=new FileInputStream(fnm);

                                while((ch=fis.read())!=-1)
                                {

                                        data=data+(char)ch;
                                }
                                fis.close();
                                t.setText(data);



                        }catch(IOException e){}




                }

                else if(ae.getSource()==i7)
                {
                        t.setBackground(Color.white);

                }
                else if(ae.getSource()==i8)
                {
                        t.setBackground(Color.red);

                }
                else if(ae.getSource()==i9)
                {
                        t.setForeground(Color.yellow);

                }
                else if(ae.getSource()==i10)
                {
                        t.setForeground(Color.black);

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

                MyEditor my=new MyEditor();
                my.init();
                
        }
}
