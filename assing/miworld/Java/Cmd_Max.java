/** Program to find maximum no of all the command line arguments
This is the documentation part*/

class Cmd_Max
{
 public static void main(String args[])
 {
 int max=0,i,t;
 max=Integer.parseInt(args[0]);
 for(i=1;i<args.length;i++)
 {
  t=Integer.parseInt(args[i]);
  if(t>max)
  max=t;

 }
  System.out.println("Maximum element="+max);
 }
}