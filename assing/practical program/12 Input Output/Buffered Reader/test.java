					/* student application using BufferedReader with readLine() method  */


import java.io.*;

class Student
{
        private int roll,m1,m2,m3,total;
        private String name,address;
        private double avg;

        public void getdata()throws Exception                                                                                           //method
        {
                String s;

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Roll No :");
                s=br.readLine();                               					  //enter roll no.
                roll=Integer.parseInt(s.trim());						  //type casting is needed b'coz it's number		

                System.out.println("Enter Name :");                                                                                        //enter name
                name=br.readLine();							   //type casting is not needed b'coz it's string	

                System.out.println("Enter Address :");
                address=br.readLine();

                System.out.println("Enter Marks of Subject 1 :");
                s=br.readLine();
                m1=Integer.parseInt(s.trim());

                System.out.println("Enter Marks of Subject 2 :");
                s=br.readLine();
                m2=Integer.parseInt(s.trim());

                System.out.println("Enter Marks of Subject 3 :");
                s=br.readLine();
                m3=Integer.parseInt(s.trim());

               total=m1+m2+m3;

               avg=(double)total/3;
        }

        public void putdata()throws Exception                                                                                                      //method
        {
                System.out.println("Roll No :" + roll);
                System.out.println("Name :" + name);
                System.out.println("Address :" + address);
                System.out.println("Subject 1 :" + m1);
                System.out.println("Subject 2 :" + m2);
                System.out.println("Subject 3 :" + m3);
                System.out.println("Total :" + total);
                System.out.println("Average :" + avg);
        }
}


class test										//main class
{
        public static void main(String args[])throws Exception
        {
                Student s=new Student();
                s.getdata();
                s.putdata();
        }
}
