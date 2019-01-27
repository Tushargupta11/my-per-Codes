                        /* Buffered Reader with read() method */
                        /* read() method read single character */

import java.io.*;

class BRread
{
        public static void main(String args[])throws Exception
        {
                char c;

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter characters until press 'q'");

                do
                {
                        c=(char)br.read();
                        System.out.println(c);
                }while(c!='q');
        }
}
                                             
