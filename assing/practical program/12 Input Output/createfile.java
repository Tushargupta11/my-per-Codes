                             /* Create File using IO */

                  /* File is created at where we store java file */


import java.io.*;


class createfile                                                          
{
        public static void main(String args[])
        {
                int x;

                try
                {
                        FileOutputStream fos=new FileOutputStream(args[0]);             //accept file name

                        System.out.println("Enter Data,Press Ctrl+Z for Exit");         //Enter data,press Ctrl+Z+Enter for exit

                        while((x=System.in.read())!=-1)                                 //Enter data until -1 is not found
                        {
                                fos.write(x);                                           //write data in file
                        }

                        fos.close();                                                    //file close

                        System.out.println("File Created");
                }
                catch(Exception e)
                {
                        System.out.println("Exception :" + e);
                }
        }
}                                 
                     
                      
                     

                        
