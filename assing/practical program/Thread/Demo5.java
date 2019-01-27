class NewThread3 implements Runnable
{
        Thread t;
        String name;
                    
        NewThread3(String threadname)
        {
                name=threadname;
                t=new Thread(this,name);
                System.out.println("New Thread :" + t);
                t.start();
        }

        public void run()
        {
                try
                {
                        for(int i=5;i>0;i--)
                        {
                                System.out.println(name + ":" + i);
                                Thread.sleep(1000);
                        }
                }
                catch(InterruptedException e)
                {
                        System.out.println("Exception :" + e);
                }

                System.out.println(name + " exiting");
        }
}

class Demo5
{
        public static void main(String args[])
        {
                NewThread3 n1=new NewThread3("One");
                NewThread3 n2=new NewThread3("Two");

                System.out.println("n1 isAlive :" + n1.t.isAlive());
                System.out.println("n2 isAlive :" + n2.t.isAlive());

                try
                {
                        Thread.sleep(1000);
                        n1.t.join();
                        n2.t.join();
                }
                catch(InterruptedException e)
                {
                        System.out.println("Exception :" + e);
                }

                System.out.println("n1 isAlive :" + n1.t.isAlive());
                System.out.println("n2 isAlive :" + n2.t.isAlive());

        }
}
