interface shape
{
        double PIE=3.142;
        void area();
        void display();
}

class circle implements shape
{
        double ar;
        int r;

        circle(int r)
        {
                this.r=r;
        }

        public void area()
        {
                ar=PIE*r*r;
        }

        public void display()
        {
                System.out.println("Area :" + ar);
        }
}

class rectangle implements shape
{
        double ar;
        int length,breadth;

        rectangle(int l,int b)
        {
                length=l;
                breadth=b;
        }

        public void area()
        {
                ar=length*breadth;
        }

        public void display()
        {
                System.out.println("Area :" + ar);
        }
}

class testinterface1
{
        public static void main(String args[])
        {
                circle c=new circle(2);

                c.area();
                c.display();

                rectangle r=new rectangle(2,2);
                r.area();
                r.display();
        }
}
