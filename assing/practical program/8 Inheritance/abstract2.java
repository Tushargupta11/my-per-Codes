                       /* abstract class with concrete method */


abstract class A2
{
        final double PIE=3.142;                       //cannot change

        double ar;                                    //inherited

        abstract void area();                         //only declaration

        void display()                                //concrete method
        {
                System.out.println("Area=" + ar);
        }
}

class B2 extends A2                                   //child class
{
        int r;

        B2(int r)                                     //constructor
        {
                this.r=r;
        }

        void area()                                   //abstract method define.
        {
                ar=PIE*r*r;
        }
}

class abstract2                                       //main
{
        public static void main(String args[])
        {
                B2 b2=new B2(2);

                b2.area();
                b2.display();
        }
}
