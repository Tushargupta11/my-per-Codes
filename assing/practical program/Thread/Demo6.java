class NewThread4 implements Runnable
{
        Thread t;
        String name;

        NewThread4(String threadname)
        {
                name=threadname;
                t=new Thread(this,name);
                t.start();
        }

        public void run()
        {
                try
                {
                        for(int i=1;i<=15;i++)
                        {
                                System.out.println(name + ":" + i);
                                Thread.sleep(200);
                        } 
                }
                catch(InterruptedException e)
                {
                        System.out.println("Exception :" + e);
                }
        }
}

class Demo6
{                         
        public static void main(String args[])
        {
                NewThread4 op1=new NewThread4("One");
                NewThread4 op2=new NewThread4("Two");

                try
                {
                        Thread.sleep(1000);
                        op1.t.suspend();
                        System.out.println("Thread one is suspended");

                        Thread.sleep(1000);
                        op1.t.resume();
                        System.out.println("Thread one is resumed");

                        op2.t.suspend();
                        System.out.println("Thread two is suspended");

                        Thread.sleep(1000);
                        op2.t.resume();
                        System.out.println("Thread two is resumed");
                }
                catch(InterruptedException e)
                {
                        System.out.println("Exception :" + e);
                }

                try
                {
                        op1.t.join();
                        op2.t.join();
                }
                catch(InterruptedException e)
                {
                        System.out.println("Exception :" + e);
                }

        }
}
