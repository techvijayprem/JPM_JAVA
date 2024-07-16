package CURD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	
	static Connection cn;
	
	public static final String username="root";
	public static final  String password="vijay";
	public static final  String url = "jdbc:mysql://localhost:3306/demo1";
	public static Connection getConnection() {
	  
	try {
		//ste2 : load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	 
		cn = DriverManager.getConnection(url,username,password);
		//System.out.println(cn);
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}	
		
	return(cn);
	}

}
