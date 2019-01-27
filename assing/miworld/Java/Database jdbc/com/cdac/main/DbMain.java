package com.cdac.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.cdac.action.MethodImpl;
import com.cdac.beans.RegisterBean;
import com.cdac.connection.MyCon;

public class DbMain {

	DbMain()
	{


		int ch,i;
		int accno;
		String accname;
		double balance;
		String actype;		
		Scanner sc = new Scanner(System.in);
		
		MethodImpl mi = new MethodImpl();
		RegisterBean rb = new RegisterBean();
		Connection con = new MyCon().config();
		
		ResultSet rs;
		do{
			System.out.println("\n 1.insert");
			System.out.println("2.update");
			System.out.println("3.Delete");
			System.out.println("4.Retreive All");
			System.out.println("5.Retreive one");
			System.out.println("6.exit");
			System.out.println("7.Transfer");
			System.out.println("Enter Your choice");
			ch = Integer.parseInt(sc.nextLine());
			switch(ch)
			{
			case 1: System.out.println("Enter Account no");
					accno= Integer.parseInt(sc.nextLine());
					
					System.out.println("Enter Type");
					actype= sc.nextLine();
					
					System.out.println("Enter Balance");
					balance= Double.parseDouble(sc.nextLine());
					
					System.out.println("Enter Name");
					accname= sc.nextLine();
					
					rb.setAccno(accno);
					rb.setBal(balance);
					rb.setType(actype);
					rb.setName(accname);
				 i=	mi.insertRecord(rb, con);
					if(i>0)
					{
						System.out.print("Inserted");
					}
					
					break;
					
			case 2:	System.out.println("Enter Account no");
			accno= Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Type");
			actype= sc.nextLine();
			
			System.out.println("Enter Balance");
			balance= Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Name");
			accname= sc.nextLine();
			
			rb.setAccno(accno);
			rb.setBal(balance);
			rb.setType(actype);
			rb.setName(accname);
		i=	mi.updateRecord(rb, con);
			if(i>0)
			{
				System.out.print("Updated");
			}
			
				
					break;
			case 3: 
					System.out.println("Enter Accno");
					accno = Integer.parseInt(sc.nextLine());
				
					i = mi.deletRecord(con, accno);
					
					break;
			case 4:
					rs= mi.selectAll(con);
				try {
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4));
					
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
			case 5: 
						System.out.println("Enter Account number");
						accno = Integer.parseInt(sc.nextLine());
					rs	=		mi.SelectAll(con, accno);
				try {
					if(rs.next())
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4));
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6: System.exit(0); 
					break;
			case 7: 	System.out.println("Enter sender Account");
						int sendacc= Integer.parseInt(sc.nextLine());
						
						System.out.println("Enter receiver Account");
						int recacc= Integer.parseInt(sc.nextLine());
						
						System.out.println("Enter amount");
						int amnt= Integer.parseInt(sc.nextLine());
						
						i= mi.withdrawl(con, sendacc, recacc, amnt);
						if(i>0)
						{
							System.out.println("Successfully Transfered");
						}
					break;
			default: System.out.println("OOPS wrong choice");		
			}
			
			
		}
		
		while(true);
		
		
	}
	public static void main(String ar[])
	{
		
		new DbMain();
	}

}
