                        /* create tiny editor */


import java.io.*;

class tinyEditor
{
        public static void main(String args[])throws Exception
        {
                String str[]=new String[100];

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter lines of text.");
                System.out.println("Enter 'stop' to quit");

                for(int i=0;i<100;i++)
                {
                        str[i]=br.readLine();

                        if(str[i].equals("stop"))
                                break;
                }

                System.out.println("Here is your file:");

                for(int i=0;i<100;i++)
                {
                        if(str[i].equals("stop"))
                                break;

                        System.out.println(str[i]);
                }
        }
}
