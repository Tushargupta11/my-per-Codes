import java.awt.*;

class MenuDemo extends Frame
{
        MenuBar mb;
        Menu m1,m2,m3,m4,m5;
        MenuItem c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;

        public MenuDemo()
        {
                setSize(400,400);

                mb=new MenuBar();

                m1=new Menu("File");
                        c1=new MenuItem("New");
                        c2=new MenuItem("Open");
                        c3=new MenuItem("Save");

                        m1.add(c1);
                        m1.add(c2);
                        m1.add(c3);

                m2=new Menu("Edit");
                        c4=new MenuItem("Cut");
                        c5=new MenuItem("Copy");
                        c6=new MenuItem("Paste");

                        m2.add(c4);
                        m2.add(c5);
                        m2.add(c6);

                m3=new Menu("Color");
                        m4=new Menu("Foreground");
                                c7=new MenuItem("Red");
                                c8=new MenuItem("Green");

                        m5=new Menu("Background");
                                c9=new MenuItem("Cyan");
                                c10=new MenuItem("Yellow");

                        m4.add(c7);
                        m4.add(c8);
                        m5.add(c9);
                        m5.add(c10);

                        m3.add(m4);
                        m3.add(m5);

                        mb.add(m1);
                        mb.add(m2);
                        mb.add(m3);

                        setMenuBar(mb);

                        setVisible(true);

        }

        public static void main(String args[])
        {
                MenuDemo md=new MenuDemo();
        }
}
