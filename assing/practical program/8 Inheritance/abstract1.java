abstract class parent                                     //abstract class
{
        abstract public void display();                   //abstrct method
}                                                         //only declaration


class child extends parent
{
        public void display()                            //definition of abstract
        {
                System.out.print("Child class");
        }
}

class abstract1
{
        public static void main(String args[])
        {
                child c=new child();
                c.display();
        }
}
