import java.util.*;

class switch1
{
        public static void main(String args[])
        {
                //int i=Integer.parseInt(args[0]);
		System.out.println("Enter your choice");
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();

                String season;

                switch(i)
                {
                        case 12:
                        case 1:
                        case 2:
                                        season="Winter";
                                        break;
                        case 3:
                        case 4:
                        case 5:
                                        season="Spring";
                                        break;
                        case 6:
                        case 7:
                        case 8:
                                        season="Summer";
                                        break;
                        case 9:
                        case 10:
                        case 11:
                                        season="Autumn";
                                        break;
                        default:
                                        season="Wrong Choice";
                }
                System.out.print("Season is :" + season);
        }
}
