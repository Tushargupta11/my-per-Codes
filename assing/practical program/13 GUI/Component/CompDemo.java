                        /* Make Simple Application Window */


import java.awt.*;

class CompDemo extends Frame
{
        Label l1,l2,l3;

        TextField t1,t2;

        TextArea t3;

        Button b1,b2;


        public CompDemo()                             
        {
                setSize(800,600);                                      //resolution
                setLayout(new FlowLayout());

                l1=new Label("Username");
                l2=new Label("Password");
                l3=new Label("Comments");

                t1=new TextField(50);
                t2=new TextField(30);
                t2.setEchoChar('*');                                  //password field

                t3=new TextArea(" ",10,50,TextArea.SCROLLBARS_BOTH);

                b1=new Button("Submit");
                b2=new Button("Cancel");

                add(l1);
                add(t1);
                add(l2);
                add(t2);
                add(l3);
                add(t3);
                add(b1);
                add(b2);
           
                setVisible(true);                             //by default,it is false,makr true
        }

        public static void main(String args[])
        {
                CompDemo c=new CompDemo();
        }
}

 
