                                        /* demo of 'Abstract' keyword */



abstract class shape1                                           //abstract class
{
        public final double PIE=3.142;

        protected double ar;

        abstract public void area(int r);                     //abstract method,only declaration 

        public void display()
        {
                System.out.print("Area=" + ar);        
        }
}

class circle1 extends shape
{
        public void area(int r)                              //abstract method definition
        {
                ar=PIE*r*r;
        }
}

class abstracttest
{
        public static void main(String args[])
        {
                circle c=new circle();
                c.area(2);
                c.display();
        }
}
