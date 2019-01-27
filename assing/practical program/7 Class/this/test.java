class A
{
        private int x;

        public A()                                                             //default constructor
        {
                System.out.print("\n Default Constructor");
        }

        public A(int x)                                                       //parameterized constructor
        {
                this.x=x;                                                     //'this' keyword 
                System.out.print("\n\n Parameterized Constructor");
        }

        public void display()                                                 //method
        {
                System.out.print("\n x=" + x);
        }

}


class test                                                                    //main class
{
        public static void main(String args[])
        {
                A ax=new A();                                                 //object 1
                ax.display();

                A ax1=new A(100);                                            //object 2
                ax1.display();
        }
}
