import java.awt.*;
class Awt_test extends Frame
{
     Awt_test() 
     {
           Button b=new Button("Click here");
           b.setBounds(30,100,80,30);
           add(b);
           setSize(400,400);
           setLayout(null);
           setVisible(true);
     }
     public static void main(String args[])
     {
          Awt_test f=new Awt_test();
          
     }  
     



}
/*import java.awt.*;  
public class Awt_test  
{  
    public static void main(String[] args) 
    {  
    Frame f=new Frame("Button Example");  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,80,30);  
    f.add(b);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
} */