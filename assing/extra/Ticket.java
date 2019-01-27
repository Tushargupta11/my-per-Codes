import java.util.Scanner;
class Train
{
 String source,destination;
 double fare;
 Train(String a,String b)
 {
  source=a; destination=b;
  switch(destination)
  {
   case "surat" :
                 fare=460;
                 break;
   case "mumbai" :
                 fare=560;
                 break;
   case "delhi" :
                 fare=190;
                 break;
   case "howrah" :
                 fare=695;
                 break;
   case "kanpur" :
                 fare=243;
                 break;
   case "chennai" :
                 fare=805;
                 break;
   case "bengaluru" :
                 fare=775;
                 break;
   default :
                fare=0.0;
             
  }
 }
 double return_rate()
 {
  return fare;
 }
}
class Ticket
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String name,source,destination;
  int age,count=0,child=0,adult=0;
  char sex,ch='y';
  double fare,con=0.0,net=0.0,tcon=0.0;
  System.out.print("Enter the source...");
  source=sc.next();
  System.out.print("\nEnter the destination...");
  destination=sc.next();
  Train t=new Train(source,destination);
  fare=t.return_rate();
  while(ch=='y' || ch=='Y')
  {
  System.out.print("\nEnter the name of the passenger...");
  name=sc.next();
  System.out.print("\nEnter the age of the passenger...");
  age=sc.nextInt();
  System.out.print("\nEnter the sex of the passenger...");
  sex=sc.next().charAt(0);
  System.out.print("\nDo you want to enter more passenger...");
  ch=sc.next().charAt(0);
  count++;
  if(age<=12)
  {
   con=(fare*50.0)/100.0;
   tcon=tcon+con;
   child++;
  }
  if(sex=='f' || sex=='F')
  {
   adult++;
   if(age>=58)
   {
    con=(fare*35.0)/100.0;
    tcon=tcon+con;
   }
  }
  if(sex=='m' || sex=='M')
  {
   adult++;
   if(age>=60)
   {
    con=(fare*35.0)/100.0;
    tcon=tcon+con;
   }
  }
  net=net+fare-con; 
  }
  
  System.out.print("\n\n\nSource..."+source);
  System.out.print("\n\nDestination..."+destination);
  System.out.print("\n\nTotal number of passenger(s)..."+count);
  System.out.print("\n\nTotal number of Adult(s)..."+adult);
  System.out.print("\n\nTotal number of child(s)..."+child);
  System.out.print("\n\nTotal concession..."+tcon);
  System.out.println("\n\nThe total fare is ..."+net);
 }
}






