                        /* BufferedReader with readLine() method */
                         /* readLine() nethod read full string */


import java.io.*;

class BRreadline
{
        public static void main(String args[])throws Exception
        {
                

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String str;

                System.out.println("Enter lines of text,until u enter 'stop'");

                do
                {
                        str=br.readLine();
                        System.out.println(str);

                }while(!str.equals("stop"));
        }
}
                                            
