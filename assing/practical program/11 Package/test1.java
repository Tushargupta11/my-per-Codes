package abc;

class A
{
        void display()
        {
                System.out.println("Display Method");
        }
}

class A1 extends A
{
        void show()
        {
                System.out.println("Show Method");
        }
}

class test1
{
        public static void main(String args[])
        {
                A1 a1=new A1();
                //a1.display();
                a1.show();
        }
}
