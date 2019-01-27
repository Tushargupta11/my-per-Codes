import java.util.Scanner;
import java.sql.*;
class DBSelectOne{
		
		int accno;
		Scanner sc = new Scanner(System.in);
		
		DBSelectOne(){
				
				try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","");
				Statement st = con.createStatement();
				System.out.println("enter acc no");
				accno = Integer.parseInt(sc.nextLine());
				String Query = "select * from account where accno="+accno;
				ResultSet rs = st.executeQuery(Query);
				while(rs.next())
				{
						System.out.println(rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4));
				}
		}
			catch(Exception e)
			{
					e.printStackTrace();
			}

}
//public static void main(String args[])
//		{
//				new DBSelectOne();
//		}
		
}