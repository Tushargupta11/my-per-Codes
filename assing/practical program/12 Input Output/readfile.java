                                 /* Read File */

             /* Only pass filename in commandline argument for read data */


import java.io.*;


class readfile                                                           
{
        public static void main(String args[])
        {
                int x;

                try
                {
                        FileInputStream fis=new FileInputStream(args[0]);

                        System.out.println("Data in File");

                        while((x=fis.read())!=-1)
                        {
                                System.out.println((char)x);
                        }
                        fis.close();
                }

                catch(Exception e)
                {
                        System.out.println("Exception :" + e);
                }
        }
}
          
