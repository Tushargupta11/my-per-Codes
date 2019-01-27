class shape
{
        public double PIE=3.142;
        protected double ar;

        final public void display()
        {
                System.out.print("Area=" + ar);
        }
}

class circle extends shape
{
        public double radius;

        public circle()
        {
                radius=0;
        }

        public circle(int r)
        {
                radius=r;
        }

        public void area()
        {
                ar=PIE*radius*radius;
        }
}

class test
{
        public static void main(String args[])
        {
                circle c=new circle(2);
                c.area();
                c.display();
        }
}