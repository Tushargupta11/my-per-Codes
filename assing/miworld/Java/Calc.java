import java.util.Scanner;
class Calc
{
 public static void main(String args[])
 {
  Scanner sc1=new Scanner(System.in);
   int i,k,j;
   System.out.println("Enter 1 for Addition and 2 for subtraction");
    i=sc1.nextInt();
    System.out.println("Enter 2 no.");
    j=sc1.nextInt();
    k=sc1.nextInt();
    switch(i)
  {
    case 1:
    System.out.println("Sum= "+(j+k)); 
    break;
    case 2:
    System.out.println("Difference= "+(j-k)); 
    break;
    default:
    System.out.println("Enter valid operation"); 
    break;
  } 
 }
}