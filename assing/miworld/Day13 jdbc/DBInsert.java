import java.sql.*;
import java.util.Scanner;
class DBInsert{
		
		
		Scanner sc = new Scanner(System.in);
		int accno;
		double bal;
		String name,type;
		DBInsert()
		
			{

			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","");
				
				
					Statement st = con.createStatement();
					
					System.out.println("Enter Accno. type balance and name");
					accno = Integer.parseInt(sc.nextLine());
					type= sc.nextLine();
					bal = Double.parseDouble(sc.nextLine());
					name = sc.nextLine();
						
					String Query="insert into account values("+accno+",'"+type+"',"+bal+",'"+name+"')";
					int i  = st.executeUpdate(Query);
					if(i>0)
						System.out.println("Row Inserted");
					
					
					}
					catch(Exception e)
					{
						
						e.printStackTrace();
					}
					
			}
	/*	public static void main(String args[]){
				
			new DBInsert();
			
			
		}*/
}