import java.util.*;
import java.sql.*;
class Curd{
		
		//Connection con;
				
			public static void main(String args[]){
				
				Scanner sc = new Scanner(System.in);
			
				System.out.println("Enter Your Choice");
				System.out.println("1.Insert Data");
				System.out.println("2.Update Data");
				System.out.println("3.Retreive all Data");
				System.out.println("4.Retreive Unique Data");
				System.out.println("5.Delete Data");
				System.out.println("6.Exit");
				Integer choice = Integer.parseInt(sc.nextLine());			
				
				switch(choice)
				{
						
						case 1 : new DBInsert();
									break;
						
						case 2:new DBUpdate();
								break;
						case 3:new DBSelectAll();
								break;
						case 4:new DBSelectOne();
						        break; 
						case 5:new DBDelete();
				        			break; 

						case 6: System.exit(0);
								break;
						default : System.out.println("enter Correct value");
									break;
				}
				
				
				
				
		}
}