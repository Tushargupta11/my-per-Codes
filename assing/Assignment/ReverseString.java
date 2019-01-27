import java.util.Scanner;
class ReverseString
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String arr;
  int i,len=0,start=0,end;
  System.out.print("\nEnter any string of length (max. 20)...");
  arr=sc.next();
  char ch[]=arr.toCharArray();
  for(i=0;ch[i]!='\0';i++)
  {
   len++;
  }
  end=len-1;
  for(start=0;start<len;start++)
  {
   ch[start]=ch[end];
   end--;
  }
  System.out.print("\nThe reverse of given string is...");
  for(i=0;ch[i]!=0;i++)
  {
   System.out.print(ch[i]);
  }
 }
}