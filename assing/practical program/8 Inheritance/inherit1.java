                                /* Inheritance */



class parent1                                         //parent class
{
        public int a,b;

        public void display()
        {
                System.out.println("a=" + a + "\tb=" + b);
        }
}

class child1 extends parent1                            //child class
{
        int c;                    

        void mul()
        {
                 //a=10;
                // b=20;
                
                c=a*b;
                System.out.print("Multiplication=" + c);
        }
}

class inherit1                                                 //main
{
        public static void main(String args[])
        {                                             //object create
                child1 c=new child1();

                c.a=Integer.parseInt(args[0]);
                c.b=Integer.parseInt(args[1]);

                c.display();
                c.mul();
        }
}

