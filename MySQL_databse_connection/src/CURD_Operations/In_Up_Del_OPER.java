package CURD_Operations;

import java.sql.*;
import java.util.Scanner;

import javax.sql.*;

public class In_Up_Del_OPER {
	
 	 static Statement st;
	static Connection cn;
	
	public In_Up_Del_OPER()
	{
		cn = connection.getConnection();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void insertData(int enroll, String name, String stream)
	{
		String squery = "insert into students values ('" + enroll +"','"+ name +"','"+ stream +" ')";
		// System.out.print(squery);

		try {
		int r = 	st.executeUpdate(squery);
		System.out.print(r);
		
			if(r>0)
			{
				System.out.println("Record Inserted SuccessFully ..");
			}
		} 
		catch( SQLIntegrityConstraintViolationException sq)
		{
			System.out.println("cannot duplicate enrollment number..");

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void updateData(int enroll, String name, String stream ) {

	 String squery = "update students set name = '" + name + "', stream = '"+ stream +"' where enroll = "+enroll;
	 
	 try {
		int r = st.executeUpdate(squery);
		if(r>0)
		{
			System.out.println("Record Updateds Successfulyy ..");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
	}
	
	public static void deleteData()
	{
		String sq = "delete from students where enroll = 1200";
		try {
			int k = st.executeUpdate(sq);
			if(k>0)
			{
				System.out.println(" Recored Deleted ...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void search()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Enroll Number => ");
		int enroll = sc.nextInt();
		 
		String sq = " select * from students where enroll = "+ enroll;
		 
		try {
			  ResultSet r =  st.executeQuery(sq);
			
			if(!r.isBeforeFirst())
			{
				System.out.println(" Recored Not Existed ...");
			}
			else
			{
			while(r.next())
			{
				System.out.println(r.getString(1)+" " + r.getString(2) +" " + r.getString(3));
			}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	
	public static void get_data()
	{
		String sq = "select * from students";
		try {
			ResultSet r = st.executeQuery(sq);
			
			while(r.next())
			{
				System.out.println(r.getString(1)+" " + r.getString(2) +" " + r.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
