


class A
{
        public void display()
        {
                System.out.print("A class");
        }
}

class B extends A
{
        public void display()
        {
                System.out.print("B class");
        }
}

class override
{
        public static void main(String args[])
        {
                B b=new B();
                b.display();
        }
}
           
