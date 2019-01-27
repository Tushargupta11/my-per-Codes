import java.awt.*;

class GUI3 extends Frame
{
        Label l1,l2,l3;
        TextField t1,t2;
        TextArea ta;
        Button b1,b2;

        public GUI3()
        {
                setSize(800,600);

                setLayout(new FlowLayout());

                l1=new Label("Username");
                t1=new TextField(50);

                l2=new Label("Password");
                t2=new TextField(30);
                t2.setEchoChar('*');

                l3=new Label("Comments");
                ta=new TextArea("",20,50,TextArea.SCROLLBARS_BOTH);

                b1=new Button("Submit");
                b2=new Button("Exit");

                add(l1);
                add(t1);
                add(l2);
                add(t2);
                add(l3);
                add(ta);
                add(b1);
                add(b2);

                setVisible(true);
        }

        public static void main(String args[])
        {
                GUI3 g=new GUI3();
        }
}
        
  
                     
                                       

