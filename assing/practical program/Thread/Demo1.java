class Demo1
{
      public static void main(String args[])
      {
        Thread t=Thread.currentThread();

        System.out.println("Current Thread :" + t);
        System.out.println("Current Name :" + t.getName());
        System.out.println("Current Priority :" + t.getPriority());

   /*     t.setName("My Thread");
        t.setPriority(10);

        System.out.println("After Name Changed :" + t);

        try
        {
                for(int i=0;i<=5;i++)
                {
                        System.out.println("i=" + i);
                        Thread.sleep(1000);
                }

        }
        catch(InterruptedException e)
        {
                System.out.println("Exception:" + e);
        }*/
      }
}
