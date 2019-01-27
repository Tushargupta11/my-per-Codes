import java.util.Scanner;
class Railway
{
  public static void main(String args[])
  {
        String name;        
        int n,age;
        System.out.println("Welcome to Indian Railways Ticket Booking Service for Intercity Express : Source : Jaipur");
        do
        {
        System.out.println("\n\nEnter the Destination(number against it)");
        double m,a,o;

        System.out.println("1. Mumbai");
        System.out.println("2. Pune");
        System.out.println("3. Nagpur");
        System.out.println("4. Yawatmaal");
        System.out.println("5. Lokhandwala");
        System.out.println("6 follwed by and 3 numbers. Quit");
        Scanner sc1=new Scanner(System.in);
          n=sc1.nextInt();
              System.out.println("Enter the No of Passengers CategoryWise\nFor Ex: 1,2,3 i.e \n1- General\n2 - Senior Citizen\n3 - Children"); 
                  double g=sc1.nextDouble();      
                  double s=sc1.nextDouble();  
                  double c=sc1.nextDouble();   
                  double t=g+s+c;                  

        switch(n)
        {

         case 1:
          System.out.println("Enter the Class of Seat:  \n1 - SL (General - Rs.100, Senior Citizen - Rs. 80, Children - Rs. 50/per Ticket)\n2 - AC(General - Rs.500, Senior Citizen - Rs. 300, Children - Rs. 150/per Ticket)\n3 - Chair Car(General - Rs.300, Senior Citizen - Rs. 200, Children - Rs. 100/per Ticket)");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Sleeper Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(100*g));
                   System.out.println("Senior Citizen="+(80*s));
                   System.out.println("Children="+(50*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Mumbai(MUM)");
                   System.out.println("Total Fare="+(100*g+80*s+50*c));
                   System.out.println("************************************");
          }
               else if(m==2)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Air Condition(AC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(500*g));
                   System.out.println("Senior Citizen="+(300*s));
                   System.out.println("Children="+(150*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Mumbai(MUM)");
                   System.out.println("Total Fare="+(500*g+300*s+150*c));
                   System.out.println("************************************");
          }
               else if(m==3)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Chair Car(CC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(300*g));
                   System.out.println("Senior Citizen="+(200*s));
                   System.out.println("Children="+(100*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Mumbai(MUM)");
                   System.out.println("Total Fare="+(300*g+200*s+100*c));
                   System.out.println("************************************");
          }
               else 
          {
                   System.out.println("Enter a valid Class Category");

          }   
           break;
         case 2:
          System.out.println("Enter the Class of Seat:  \n1 - SL (General - Rs.200, Senior Citizen - Rs. 80, Children - Rs. 50/per Ticket)\n2 - AC(General - Rs.600, Senior Citizen - Rs. 300, Children - Rs. 150/per Ticket)\n3 - Chair Car(General - Rs.300, Senior Citizen - Rs. 200, Children - Rs. 100/per Ticket)");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Sleeper Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(200*g));
                   System.out.println("Senior Citizen="+(80*s));
                   System.out.println("Children="+(50*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Pune(PUN)");
                   System.out.println("Total Fare="+(200*g+80*s+50*c));
                   System.out.println("************************************");
          }
               else if(m==2)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Air Condition(AC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(600*g));
                   System.out.println("Senior Citizen="+(300*s));
                   System.out.println("Children="+(150*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Pune(PUN)");
                   System.out.println("Total Fare="+(600*g+300*s+150*c));
                   System.out.println("************************************");
          }
               else if(m==3)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Chair Car(CC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(300*g));
                   System.out.println("Senior Citizen="+(200*s));
                   System.out.println("Children="+(100*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Pune(PUN)");
                   System.out.println("Total Fare="+(300*g+200*s+100*c));
                   System.out.println("************************************");
          }
               else 
          {
                   System.out.println("Enter a valid Class Category");

          }   
           break;
         case 3:
          System.out.println("Enter the Class of Seat:  \n1 - SL (General - Rs.200, Senior Citizen - Rs. 80, Children - Rs. 50/per Ticket)\n2 - AC(General - Rs.600, Senior Citizen - Rs. 300, Children - Rs. 150/per Ticket)\n3 - Chair Car(General - Rs.300, Senior Citizen - Rs. 200, Children - Rs. 100/per Ticket)");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Sleeper Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(200*g));
                   System.out.println("Senior Citizen="+(80*s));
                   System.out.println("Children="+(50*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Nagpur");
                   System.out.println("Total Fare="+(200*g+80*s+50*c));
                   System.out.println("************************************");
          }
               else if(m==2)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Air Condition(AC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(600*g));
                   System.out.println("Senior Citizen="+(300*s));
                   System.out.println("Children="+(150*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Nagpur");
                   System.out.println("Total Fare="+(600*g+300*s+150*c));
                   System.out.println("************************************");
          }
               else if(m==3)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Chair Car(CC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(300*g));
                   System.out.println("Senior Citizen="+(200*s));
                   System.out.println("Children="+(100*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Nagpur");
                   System.out.println("Total Fare="+(300*g+200*s+100*c));
                   System.out.println("************************************");
          }
               else 
          {
                   System.out.println("Enter a valid Class Category");

          }   
           break;
         case 4:
          System.out.println("Enter the Class of Seat:  \n1 - SL (General - Rs.200, Senior Citizen - Rs. 80, Children - Rs. 50/per Ticket)\n2 - AC(General - Rs.600, Senior Citizen - Rs. 300, Children - Rs. 150/per Ticket)\n3 - Chair Car(General - Rs.300, Senior Citizen - Rs. 200, Children - Rs. 100/per Ticket)");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Sleeper Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(200*g));
                   System.out.println("Senior Citizen="+(80*s));
                   System.out.println("Children="+(50*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Yawatmaal");
                   System.out.println("Total Fare="+(200*g+80*s+50*c));
                   System.out.println("************************************");
          }
               else if(m==2)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Air Condition(AC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(600*g));
                   System.out.println("Senior Citizen="+(300*s));
                   System.out.println("Children="+(150*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Yawatmaal");
                   System.out.println("Total Fare="+(600*g+300*s+150*c));
                   System.out.println("************************************");
          }
               else if(m==3)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Chair Car(CC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(300*g));
                   System.out.println("Senior Citizen="+(200*s));
                   System.out.println("Children="+(100*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to Yawatmaal");
                   System.out.println("Total Fare="+(300*g+200*s+100*c));
                   System.out.println("************************************");
          }
               else 
          {
                   System.out.println("Enter a valid Class Category");

          }   
           break;
         case 5:
          System.out.println("Enter the Class of Seat:  \n1 - SL (General - Rs.200, Senior Citizen - Rs. 80, Children - Rs. 50/per Ticket)\n2 - AC(General - Rs.600, Senior Citizen - Rs. 300, Children - Rs. 150/per Ticket)\n3 - Chair Car(General - Rs.300, Senior Citizen - Rs. 200, Children - Rs. 100/per Ticket)");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Sleeper Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(200*g));
                   System.out.println("Senior Citizen="+(80*s));
                   System.out.println("Children="+(50*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to  Lokhandwala");
                   System.out.println("Total Fare="+(200*g+80*s+50*c));
                   System.out.println("************************************");
          }
               else if(m==2)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Air Condition(AC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(600*g));
                   System.out.println("Senior Citizen="+(300*s));
                   System.out.println("Children="+(150*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to  Lokhandwala");
                   System.out.println("Total Fare="+(600*g+300*s+150*c));
                   System.out.println("************************************");
          }
               else if(m==3)
          {
                   System.out.println("Total Passengers="+t);              
                   System.out.println("Class Choosen : Chair Car(CC) Class");                    
                   System.out.println("Fare Category wise\nGeneral="+(300*g));
                   System.out.println("Senior Citizen="+(200*s));
                   System.out.println("Children="+(100*c));
                   System.out.println("************************************");
                   System.out.println("Ticket/s booked from Jaipur(JAI) to  Lokhandwala");
                   System.out.println("Total Fare="+(300*g+200*s+100*c));
                   System.out.println("************************************");
          }
               else 
          {
                   System.out.println("Enter a valid Class Category");

          }   
           break;

           case 6:
           break;
          default:
                   System.out.println("Try Again");
          }
        }while(n!=6);
  }
}