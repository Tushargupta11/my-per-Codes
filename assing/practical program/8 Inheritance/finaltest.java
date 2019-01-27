                                  /* Demo of 'final' keyword */
                                    


class shape                                                 //parent class
{
        public final double PIE=3.142;                      //cannot change
        protected double ar;                                //must be inherited

        final public void display()                         //final method
        {
                System.out.print("Area=" + ar);
        }
}

class circle extends shape                                 //child class
{
        public double radius;

        public circle()                                    //default constructor
        {
                radius=0;
        }

        public circle(int r)                               //para.constructor
        {
                radius=r;
        }

        public void area()                                 //method
        {
                ar=PIE*radius*radius;
        }

       /* public void area(int r)                          //it works
        {
                ar=PIE*r*r;
        } */
}

class finaltest                                            //main method
{
        public static void main(String args[])
        {
                circle c=new circle(2);                    //create object
               c.area();

                //c.area(2);                               //it works

                c.display();
        }
}
