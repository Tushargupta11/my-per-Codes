class NewThread2 implements Runnable
{
        Thread t;
        String name;

        NewThread2(String threadname)
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
                        for(int i=0;i<=5;i++)
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

class Demo4
{
        public static void main(String args[])
        {
                new NewThread2("One");
                new NewThread2("Two");

                try
                {
                        Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                        System.out.println("Exception :" + e);
                }
        }
}
