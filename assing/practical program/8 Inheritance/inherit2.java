                  /* Method in child override on method in parent */



class A1                                                     //parent class
{
        public int a,b;

        void display()
        {
                System.out.println("a=" + a + "\tb=" + b);
        }
}

class B1 extends A1                                          //child class
{
        int c;

        void display()                                      //override method
        {
                c=a*b;
                System.out.print("Multiplication=" + c);
        }
}

class inherit2
{
        public static void main(String args[])
        {
                B1 b1=new B1();

                b1.a=Integer.parseInt(args[0]);
                b1.b=Integer.parseInt(args[1]);

                b1.display();
        }
}
