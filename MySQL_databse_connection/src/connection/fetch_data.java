package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class fetch_data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","vijay");
		
		PreparedStatement ps = con.prepareStatement("select * from Students");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
		//	int enrollment = rs.getInt("enroll");
		//	System.out.println(enrollment);
			
			System.out.println("Enrollment => " +rs.getInt("enroll"));
			System.out.println("name => " +rs.getString("name"));
			System.out.println("Stream => " +rs.getString("stream"));

		}
	}

}
