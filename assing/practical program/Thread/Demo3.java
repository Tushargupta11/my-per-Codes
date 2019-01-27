class NewThread1 extends Thread
{
        NewThread1()
        {
                super("Child");
                System.out.println("Child Thread" + this);
                start();
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

                System.out.println("Exiting from Child");
        }
}

class Demo3
{
        public static void main(String args[])
        {
                new NewThread1();

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

                System.out.println("Exiting from Main");
        }
}
