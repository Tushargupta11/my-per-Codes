import java.util.Scanner;
class S7_3
{
      public static void main(String args[])
      {
                System.out.println("Enter a string:");
                Scanner sc=new Scanner(System.in);
                String s=sc.next();
                String r="";
                for(int i=s.length()-1;i>=0;i--)
                {
                       r=r+s.charAt(i);
                }
                System.out.println("Reverse String is:");
                System.out.print(r);
        }
}

/** charAt(i) -->> it is used to fetch single character at the end of the string and then append it in the reverse string.
