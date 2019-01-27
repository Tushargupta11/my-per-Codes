import java.util.*;
import java.sql.*;

class DBUpdate{
		
		Scanner sc = new Scanner(System.in);
		int accno;
		double bal;
		String name,type;
		DBUpdate()
		{
				try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","");
				Statement st = con.createStatement();
				System.out.println("Enter Acc");
				
				accno = Integer.parseInt(sc.nextLine());
				System.out.println("enter name");
				name = sc.nextLine();
				String Query="update account set acname='"+name+"' where accno="+accno;
				int i = st.executeUpdate(Query);
				if(i>0)
					System.out.println("Row Updated");
				
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
				
		}
		
//		public static void main(String args[])
//		{
//				new DBUpdate();
//		}
}