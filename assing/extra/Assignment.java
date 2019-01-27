import java.util.Scanner;
class Pizza
{
  int ch,size,srate,mrate,lrate;
  Pizza(int x,int y)
  {
   ch=x;
   size=y;
   switch(ch)
   {
    case 1:
        srate=120;
        mrate=150;
        lrate=200;
        break;

    case 2:
        srate=130;
        mrate=180;
        lrate=250;
        break;

    case 3:
        srate=170;
        mrate=250;
        lrate=400;
        break;

    case 4:
        srate=100;
        mrate=130;
        lrate=180;
        break;

    case 5:
        srate=140;
        mrate=190;
        lrate=260;
        break;
 
    case 6:
        srate=340;
        mrate=450;
        lrate=600;
        break;
 
    case 7:
        srate=60;
        mrate=120;
        lrate=180;
        break;

    case 8:
        srate=270;
        mrate=395;
        lrate=550;
        break;

    default:
        srate=0;
        mrate=0;
        lrate=0;
   } 
  }
  int return_rate()
  {
   if(size==1)
   {
    return srate;
   }
   else if(size==2)
   {
    return mrate;
   }
   else if(size==3)
   {
    return lrate;
   }
   else
   {
    return 0;
   }
  }
}
class Order
{
 public static void main(String args[])
 {
  int ch,size,brate,qty;
  double gtax,wtax,frate=0.0;
  Scanner sc=new Scanner(System.in);
  do
  {
  System.out.println("Pizza");
  System.out.print("\n1. Cheese Pizza");
  System.out.print("\n2. Panner Pizza");
  System.out.print("\n3. Chicken Pizza");
  System.out.print("\n4. Pizza 4");
  System.out.print("\n5. Pizza 5");
  System.out.print("\n6. Pizza 6");
  System.out.print("\n7. Pizza 7");
  System.out.print("\n8. Pizza 8");
  System.out.print("\n9. Exit");
  System.out.print("\nSelect your Choice...");
  ch=sc.nextInt();
  if(ch>=1 && ch<=8)
  {
  System.out.println("\n\n\nSize");
  System.out.println("1. Small");
  System.out.println("2. Medium");
  System.out.println("3. Large");
  System.out.print("Select the size...");
  size=sc.nextInt();
  System.out.print("\nEnter the Quantity Required...");
  qty=sc.nextInt();
  Pizza p=new Pizza(ch,size);
  brate=p.return_rate();
  gtax=((brate*5.0)/100.0)*qty;
  wtax=((brate*5.0)/100.0)*qty;
  frate=frate+(brate*qty)+gtax+wtax;
  }
  }while(ch!=9);
  System.out.print("\nFinal Amount is.."+frate);
  System.out.print("\nThank you for visiting!!!!");
 }
}