package com.cdac.connection;



import java.sql.*;
public class MyCon {


	Connection con;
	public Connection config(){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		 con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","");
		
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
		}
		
		return con;
	}
}
