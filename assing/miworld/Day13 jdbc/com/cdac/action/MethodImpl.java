package com.cdac.action;

import java.sql.*;

import com.cdac.beans.RegisterBean;
import com.cdac.connection.MyCon;


public class MethodImpl {

	private String query;
	private int i;
	private ResultSet rs ;
	//RegisterBean rb = new RegisterBean();
	Connection con = new MyCon().config();
	PreparedStatement ps;
	public int insertRecord(RegisterBean rb,Connection con){
		
		query= "insert into account values(?,?,?,?)";
		
		try {
			 ps = con.prepareStatement(query);
			ps.setInt(1, rb.getAccno());
			ps.setString(2, rb.getType());
			ps.setDouble(3,rb.getBal());
			ps.setString(4, rb.getName());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}
	
	public ResultSet selectAll(Connection con)
	{
		query="select *from account";
		try {
			ps=con.prepareStatement(query);
			rs= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public ResultSet SelectAll(Connection con,int accno){
		
		query = "select *from account where accno=?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, accno);
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rs;
		
	}
	
	public int deletRecord(Connection con,int accno){
		
		query= "delete from account where accno=?";
		
		try {
			ps= con.prepareStatement(query);
			ps.setInt(1, accno);
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	public int updateRecord(RegisterBean rb,Connection con)
	{
		
		query = "update account set actype=?,balance=?,acname=? where accno=?";
		try {
			ps= con.prepareStatement(query);
			ps.setString(1, rb.getType());
			ps.setDouble(2, rb.getBal());
			ps.setString(3, rb.getName());
			ps.setInt(4, rb.getAccno());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public int balance(Connection con,int accno)
	{
		int bal=0;
		query = "select balance from account where accno=?";
		try{
			ps= con.prepareStatement(query);
			ps.setInt(1,accno);
			rs=ps.executeQuery();
			if(rs.next())
				bal= rs.getInt(1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return bal;
	}
	
	public int withdrawl(Connection con,int sender,int receiver,int sendAmnt)
	{
		int sendbal= balance(con,sender);
		if(sendbal>1000 && sendAmnt<=sendbal)
		{
			query = "update account set balance=balance-"+sendAmnt+"where accno=?";
			String query1= "update account set balance=balance"+sendAmnt+ "where accno=?";
			try {
				ps= con.prepareStatement(query);
				ps.setInt(1, sender);
				ps.executeUpdate();
				ps= con.prepareStatement(query1);
				ps.setInt(1, receiver);
			i=	ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Balance Insufficient");
		}
		return i;
	}
}
