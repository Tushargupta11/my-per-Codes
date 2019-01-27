                                /* Demonstration of String Function */


class stringDemo
{
        public static void main(String args[])
        {
                byte b[]={65,66,67,68,69,70};              //byte array

                String s1=new String(b);                   //string object
                System.out.print("\n s1=" + s1);

                String s2=new String(b,0,3);              //string object(print substring)
                System.out.print("\n s2="  + s2); 

                char ch[]={'A','B','C','D'};              //char array

                String s3=new String(ch);                 //string object
                System.out.print("\n s3=" + s3);

                String s4=new String(ch,0,3);             //string object(print substring)
                System.out.print("\n s4=" + s4);

                String s5="Computer";

                System.out.print("\n Character=" + s5.charAt(3));         //character at specific point 
                System.out.print("\n Uppercase=" + s5.toUpperCase());     //uppercase
                System.out.print("\n Lowercase=" + s5.toLowerCase());     //lowercase
                System.out.print("\n Length=" + s5.length());             //length


              /*  String s6="computer";
                s6.equals(s5);
                s6.equals Ignore(s5);
              */

                char c1[]=s5.toCharArray();
                byte b1[]=s5.getBytes();

                for(int i=0;i<c1.length;i++)
                {
                        System.out.print("\n\t" + c1[i] + "\t" + b1[i]);
                }

                System.out.print("\n Substring=" + s5.substring(3));
                System.out.print("\n Substring=" + s5.substring(0,3));
        }

}
