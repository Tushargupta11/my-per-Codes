                        /* Application of "Scanner" class */



import java.io.*;                                          //pkg for BufferedReader
import java.util.*;                                        //pkg for Scanner

class student
{
        private int roll,m1,m2,m3,total;
        private String name;
        private double avg;

        public void getdata()throws Exception
        {
                String s;

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Roll Number :");
                s=br.readLine();
                roll=Integer.parseInt(s.trim());

                System.out.println("Enter Name :");
                name=br.readLine();

                System.out.println("Enter mark of subject 1 :");
                s=br.readLine();
                m1=Integer.parseInt(s.trim());

                System.out.println("Enter mark of subject 2 :");
                s=br.readLine();
                m2=Integer.parseInt(s.trim());

                System.out.println("Enter mark of subject 3 :");
                s=br.readLine();
                m3=Integer.parseInt(s.trim());

                total=m1+m2+m3;

                avg=(double)total/3;
        }

        public void putdata()throws Exception
        {
                System.out.println();                                   //both for spacing
                System.out.println();                                   

                System.out.println("Roll :" + roll);
                System.out.println("Name :" + name);
                System.out.println("Subject 1 :" + m1);
                System.out.println("Subject 2 :" + m2);
                System.out.println("Subject 3 :" + m3);
                System.out.println("Total :" + total);
                System.out.println("Average :" + avg);
        }
}

class TestStudent
{
        public static void main(String args[])throws Exception
        {
                int n;

                student s[];

                Scanner sc=new Scanner(System.in);

                System.out.println("How Many Students :");

                n=sc.nextInt();
                s=new student[n];

                for(int i=0;i<n;i++)
                {
                        s[i]=new student();
                        s[i].getdata();
                }

                for(int i=0;i<n;i++)
                {
                        s[i].putdata();
                }

        }
}
