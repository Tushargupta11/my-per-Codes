                                /* Filter Stream */

                /* Demo of DataInoutStream & DataOutputStream */



import java.io.*;

class dataIOdemo
{                                                                   
        public static void main(String args[])throws Exception                               
        {
                int x[]={10,143,2,9123,27,925,21,7};

                FileOutputStream fos=new FileOutputStream("SK.dat");        //create data file

                DataOutputStream dos=new DataOutputStream(fos);

                for(int i=0;i<x.length;i++)
                {
                        dos.writeInt(x[i]);
                }

                dos.close();


                int n;

                FileInputStream fis=new FileInputStream("SK.dat");

                DataInputStream dis=new DataInputStream(fis);

                try
                {
                        while(true)                                         //endless loop
                        {
                                n=dis.readInt();
                                System.out.println(n);
                        }
                }
                catch(EOFException e)
                {
                        System.out.println("Exception" + e);
                }
                finally
                {
                        dis.close();
                }
        }
}
                                    
