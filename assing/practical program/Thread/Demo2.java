class NewThread implements Runnable
{
        Thread t;

        NewThread()
        {
                t=new Thread(this,"Child Thread");
                System.out.println("Child Thread :" + t);
                t.start();
        }

        public void run()
        {
                try
                {
                        for(int i=0;i<=5;i++)
                        {
                                System.out.println("Child :" + i);
                                Thread.sleep(1000);
                        }
                }
                catch(InterruptedException e)
                {
                        System.out.println("Exception :" + e);
                }
                System.out.println("Child Thread Exiting");
        }
}       


class Demo2
{
        public static void main(String args[])
        {
                new NewThread();

                try
                {
                        for(int i=0;i<=5;i++)
                        {
                                System.out.println("Main :" + i);
                                Thread.sleep(1000);
                        }
                }
                catch(InterruptedException e)
                {
                        System.out.println("Exception :" + e);
                }
                System.out.println("Main thread exiting");
        }
}
