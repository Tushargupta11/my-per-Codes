package abc;

class A
{
        void display()
        {
                System.out.println("Display Method");
        }
}

/*class A1 extends A
{
        void show()
        {
                System.out.println("Show Method");
        }
} */

class test1
{
        public static void main(String args[])
        {
                A a=new A();
                a.display();
                //a.show();
        }
}
