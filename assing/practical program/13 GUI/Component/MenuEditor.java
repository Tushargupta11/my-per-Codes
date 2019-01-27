                      /* Application of Text Editor with Menu Bar */

import java.awt.*;

class MenuEditor extends Frame
{
        MenuBar mb;
        Menu m1,m2,m3;
        Menu c1,c2;
        MenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15;
        TextArea ta;
        Label l;

        public MenuEditor()
        {
                setSize(800,600);

                mb=new MenuBar();

                m1=new Menu("File");
                        i1=new MenuItem("New");
                        i2=new MenuItem("Open");
                        i3=new MenuItem("Save");
                        i4=new MenuItem("Save As");
                        i5=new MenuItem("Exit");

                        m1.add(i1);
                        m1.add(i2);
                        m1.add(i3);
                        m1.add(i4);
                        m1.add(i5);

                m2=new Menu("Edit");
                        i6=new MenuItem("Undo");
                        i7=new MenuItem("Redo");
                        i8=new MenuItem("Cut");
                        i9=new MenuItem("Copy");
                        i10=new MenuItem("Paste");
                        i11=new MenuItem("Select All");

                        m2.add(i6);
                        m2.add(i7);
                        m2.add(i8);
                        m2.add(i9);
                        m2.add(i10);
                        m2.add(i11);

                m3=new Menu("View");

                        c1=new Menu("Background");
                                i12=new MenuItem("Green");
                                i13=new MenuItem("Red");

                        c2=new Menu("Foreground");
                                i14=new MenuItem("Blue");
                                i15=new MenuItem("Yellow");

                        c1.add(i12);
                        c1.add(i13);

                        c2.add(i14);
                        c2.add(i15);

                        m3.add(c1);
                        m3.add(c2);


                 mb.add(m1);
                 mb.add(m2);
                 mb.add(m3);


                 ta=new TextArea("",10,20,TextArea.SCROLLBARS_BOTH);
                 l=new Label("");

                 setLayout(new BorderLayout());

                 add("Center",ta);
                 add("South",l);

                 setMenuBar(mb);
                 setVisible(true);

        }

        public static void main(String args[])
        {
                MenuEditor me=new MenuEditor();
        }
}
