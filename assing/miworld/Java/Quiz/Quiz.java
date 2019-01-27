import java.util.Scanner;
class Quiz
{
  public static void main(String args[])
  {        
        int n;
        System.out.println("Welcome to APpedia Quiz");
        do
        {
        System.out.println("\n\nEnter the Subject whose quiz you pant to play (number against it)");
        double m;

        System.out.println("1. History");
        System.out.println("2. Geography");
        System.out.println("3. Political Science");
        System.out.println("4. Quit");
        Scanner sc1=new Scanner(System.in);
          n=sc1.nextInt();
                  

        switch(n)
        {

         case 1:
          System.out.println("Test Consists of 3 Questions of 2 marks each\n+2 for correct answer\n-1 for every incorrect  answer");
          System.out.println("Press 1 to Start the Quiz");                  
          int start=sc1.nextInt();
          int score=0;
          System.out.println("Q.1 When was GandhiJi Born?\n1. 2 october 1887\n2. 2 october 1869\n3. 2 October 1879");
                  m=sc1.nextDouble();  
  if(m==1)
          {
                   score--; 

          }
               else if(m==2)
          {
                   score=score+2;                   
          }
               else if(m==3)
          {
                   score--;                   
          }
               else 
          {
                   System.out.println("Enter a valid option");
          }            
          
 System.out.println("Q.2 Who built Red Fort?\n1. Akbar\n2. Shah Jahan\n3. Auranjeeb");
                  m=sc1.nextDouble();  
  if(m==1)
          {
                   score--; 

          }
               else if(m==2)
          {
                   score=score+2;                   
          }
               else if(m==3)
          {
                   score--;                   
          }
               else 
          {
                   System.out.println("Enter a valid option");
          }     

 System.out.println("Q.3 Who has written the book PanchaTantra ?\n1. Uday Kumar\n2. Vishnu Sharma\n3.Panini");
                  m=sc1.nextDouble();  
  if(m==1)
          {
                   score--; 

          }
               else if(m==2)
          {
                   score=score+2;                   
          }
               else if(m==3)
          {
                   score--;                   
          }
               else 
          {
                   System.out.println("Enter a valid option");
          }    
         System.out.println("Quiz Ended\nYour Score="+score+"/6");   
           break;
         case 2:
          
           break;
         case 3:
         
           break;
         

           case 4:
           break;
          default:
                   System.out.println("Try Again");
          }
        }while(n!=4);
  }
}