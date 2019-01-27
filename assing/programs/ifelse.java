class ifElse
{
public static void main(String args[])
{
 int month=4;
 string season;
 
if(month==12||month==1||month==2)
season="winter";
 elseif(month==3||month==4||month==5);
 season="spring";
  elseif(month==6||month==7||month==8);
   season="summer";
   elseif(month==9||month==10||month==11);
   season="autumn";
  else; 
  season="bogus month";
 
 System.out.println("April is in the "+season+ ".");
 }
}