interface I
{
        int a=10;
        int b=20;
        void add();
        void display();
}

class A1 implements I
{
        int c;

        public void add()
        {
                c=a+b;
        }

        public void display()
        {
                System.out.println("Addition=" + c);
        }
}

class interface2
{
        public static void main(String args[])
        {
                A1 a1=new A1();
                a1.add();
                a1.display();
        }
}
   
