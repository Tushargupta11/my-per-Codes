import java.util.Scanner;
import java.sql.*;
class DBSelectAll{
		
		DBSelectAll(){
				
				try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","");
				Statement st = con.createStatement();
				String Query = "select * from account";
				ResultSet rs = st.executeQuery(Query);
				while(rs.next())
				{
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4));
				}
		}
			catch(Exception e)
			{
					e.printStackTrace();
			}

}
//public static void main(String args[])
//		{
//				new DBSelectAll();
//		}
//		
}