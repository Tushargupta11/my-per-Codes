import java.util.Scanner;
class Pizza
{
  public static void main(String args[])
  {
                int n;
        System.out.println("Welcome to Pizza Service");
        do
        {
        System.out.println("Enter the pizza you want to order");
        double m,a,o;

        System.out.println("\n\n\n1. AB Pizza");
        System.out.println("2. BC Pizza");
        System.out.println("3. CD Pizza");
        System.out.println("4. EF Pizza");
        System.out.println("5. GH Pizza");
        System.out.println("6. IJ Pizza");
        System.out.println("7. KL Pizza");
        System.out.println("8. MN Pizza");
        System.out.println("9 follwed by and number. Quit");
        Scanner sc1=new Scanner(System.in);
          n=sc1.nextInt();
                 if(n<9)
             { System.out.println("Enter the quantity of pizza"); }
                  o=sc1.nextDouble();        
        switch(n)
        {
         case 1:
          System.out.println("You have selected AB Pizza\nChoose the size from 1 - S,2 - M,3 - L");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Base Price="+(100*o));
                   a=((5.0/100.0)*100)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((100*o)+a));
          }
               else if(m==2)
          {
                   System.out.println("Base Price=120");
                   a=((5.0/100.0)*120)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((120*o)+a));
          }    
               else if(m==3)
          {
                   System.out.println("Base Price=160");
                   a=((5.0/100.0)*160)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((160*o)+a));
          }   
               else 
          {
                   System.out.println("Enter a valid Size");

          }   
           break;
         case 2:
          System.out.println("You have selected BC Pizza\nChoose the size from 1 - S,2 - M,3 - L");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Base Price="+(100*o));
                   a=((5.0/100.0)*100)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((100*o)+a));
          }
               else if(m==2)
          {
                   System.out.println("Base Price=120");
                   a=((5.0/100.0)*120)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((120*o)+a));
          }    
               else if(m==3)
          {
                   System.out.println("Base Price=160");
                   a=((5.0/100.0)*160)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((160*o)+a));
          }   
               else 
          {
                   System.out.println("Enter a valid Size");

          }  
           break;
         case 3:
          System.out.println("You have selected CD Pizza\nChoose the size from 1 - S,2 - M,3 - L");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Base Price="+(100*o));
                   a=((5.0/100.0)*100)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((100*o)+a));
          }
               else if(m==2)
          {
                   System.out.println("Base Price=120");
                   a=((5.0/100.0)*120)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((120*o)+a));
          }    
               else if(m==3)
          {
                   System.out.println("Base Price=160");
                   a=((5.0/100.0)*160)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((160*o)+a));
          }   
               else 
          {
                   System.out.println("Enter a valid Size");

          }  
           break;
         case 4:
          System.out.println("You have selected EF Pizza\nChoose the size from 1 - S,2 - M,3 - L");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Base Price="+(100*o));
                   a=((5.0/100.0)*100)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((100*o)+a));
          }
               else if(m==2)
          {
                   System.out.println("Base Price=120");
                   a=((5.0/100.0)*120)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((120*o)+a));
          }    
               else if(m==3)
          {
                   System.out.println("Base Price=160");
                   a=((5.0/100.0)*160)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((160*o)+a));
          }   
               else 
          {
                   System.out.println("Enter a valid Size");

          }  
           break;
         case 5:
          System.out.println("You have selected GH Pizza\nChoose the size from 1 - S,2 - M,3 - L");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Base Price="+(100*o));
                   a=((5.0/100.0)*100)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((100*o)+a));
          }
               else if(m==2)
          {
                   System.out.println("Base Price=120");
                   a=((5.0/100.0)*120)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((120*o)+a));
          }    
               else if(m==3)
          {
                   System.out.println("Base Price=160");
                   a=((5.0/100.0)*160)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((160*o)+a));
          }   
               else 
          {
                   System.out.println("Enter a valid Size");

          }  
           break;
         case 6:
          System.out.println("You have selected IJ Pizza\nChoose the size from 1 - S,2 - M,3 - L");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Base Price="+(100*o));
                   a=((5.0/100.0)*100)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((100*o)+a));
          }
               else if(m==2)
          {
                   System.out.println("Base Price=120");
                   a=((5.0/100.0)*120)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((120*o)+a));
          }    
               else if(m==3)
          {
                   System.out.println("Base Price=160");
                   a=((5.0/100.0)*160)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((160*o)+a));
          }   
               else 
          {
                   System.out.println("Enter a valid Size");

          }  
           break;
         case 7:
          System.out.println("You have selected KL Pizza\nChoose the size from 1 - S,2 - M,3 - L");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Base Price="+(100*o));
                   a=((5.0/100.0)*100)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((100*o)+a));
          }
               else if(m==2)
          {
                   System.out.println("Base Price=120");
                   a=((5.0/100.0)*120)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((120*o)+a));
          }    
               else if(m==3)
          {
                   System.out.println("Base Price=160");
                   a=((5.0/100.0)*160)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((160*o)+a));
          }   
               else 
          {
                   System.out.println("Enter a valid Size");

          }  
           break;
         case 8:
          System.out.println("You have selected MN Pizza\nChoose the size from 1 - S,2 - M,3 - L");
                  m=sc1.nextDouble();
          if(m==1)
          {
                   System.out.println("Base Price="+(100*o));
                   a=((5.0/100.0)*100)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((100*o)+a));
          }
               else if(m==2)
          {
                   System.out.println("Base Price=120");
                   a=((5.0/100.0)*120)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((120*o)+a));
          }    
               else if(m==3)
          {
                   System.out.println("Base Price=160");
                   a=((5.0/100.0)*160)*o;
                   System.out.println("Tax=5% of Base Price="+a);
                   System.out.println("Final price="+((160*o)+a));
          }   
               else 
          {
                   System.out.println("Enter a valid Size");

          }    
           break;
           case 9:
           break;
          default:
                   System.out.println("Try Again");
          }
        }while(n!=9);
  }
}