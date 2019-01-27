						/* Static & non-static variable,method */


class A2
{
        private int x;                                         //non-static variable

        static int y;

    /*
        public static void  main(String args[])       //this is static function
        {
                A2 a2=new A2();                       //create object

                a2.x=10;                              //non-static member must called by object of class

                a2.display();                         //method call

                //A2.y=20;                            //static variable is called by classname,but it is not needed
                y=20;                                 //it's work
                System.out.print(y);
                
        }


        public void display()                         //method definition
        {
                System.out.print(x);                  //method of class can easily access data member of class,like c++
        }

   */


       public static void main(String args[])
       {
                y=100; 
                show();                              //static method can easily call another static method
       }


       public static void show()                     
       {                                             
               System.out.print(y);                  //static method can easily call another static variable
       }
}

          
