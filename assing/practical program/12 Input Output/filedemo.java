import java.io.*;


class filedemo
{
        public static void main(String args[])
        {
                String fname=args[0];

                File f=new File(fname);

                if(f.exists())
                {
                        if(f.isFile())
                        {
                                System.out.println("It is File");

                                if(f.canWrite())
                                {
                                        System.out.println("Normal File");
                                }
                                else
                                {
                                        System.out.println("Read-Only File");
                                }
                                System.out.println("Length :" + f.length() + "byte");
                        }
                        else
                        {
                                System.out.println("It is Directory");

                                String s[]=f.list();

                                for(int i=0;i<s.length;i++)
                                {
                                        System.out.println(s[i]);
                                }
                        }
                }
                else
                {
                        System.out.println("It is not File or Directory");
                }
        }
}
