                                /* Demo of Interface */



interface I1                                              //interface 1
{
        void disp();                                      //by default methods in interface are public
        void disp1();                                     //same method in both interface


        int x=10;                                         //by default data members in interface method are static
        int z=30;                                         //same in both interface
}

interface I2                                             //interface 2
{
        void show();                                     //by default methods in interface are public
        void disp1();                                    //same method in both interface


        int y=20;                                       //by default data members in interface method are static
        int z=40;                                       //same in both interface
}

class A implements I1,I2                                //implements I1,I2 
{
        public void disp()                              //'public' b'coz method r defaultly 'public' in interface
        {
                System.out.println("Display in I1");
                System.out.println("x=" + x);
                System.out.println("z=" + I1.z);        // z called by interface name b'coz common in both
        } 

        public void show()                              //'public' b'coz method r defaultly 'public' in interface
        {                                           
                System.out.println("Show in I2");
                System.out.println("y=" + y);
                System.out.println("z=" + I2.z);       // z called by interface name b'coz common in both
        }

        public void disp1()
        {
                System.out.println("Common in I1 & I2");
        }

        void own()                                         //own method of class A
        {
                System.out.println("Own method of class");
        }
}

class testinterface 
{
        public static void main(String args[])
        {
                A a=new A();               

                a.disp();
                a.own();
                a.show();
                a.disp1();
        }
}
