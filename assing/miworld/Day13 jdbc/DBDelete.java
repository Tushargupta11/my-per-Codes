import java.util.Scanner;
import java.sql.*;
class DBDelete{
		
		int accno;
		Scanner sc = new Scanner(System.in);
		
		DBDelete(){
				
				try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","");
				Statement st = con.createStatement();
				
				System.out.println("Enter Account number");
				accno= Integer.parseInt(sc.nextLine());
			String Query = "delete from account where accno="+accno;
					st.execute(Query);
					
						System.out.println("Deleted");
		}
			catch(Exception e)
			{
					e.printStackTrace();
			}

}
//public static void main(String args[])
//		{
//				new DBDelete();
//		}
		
}