package connection;
//step0 : add mysqlconnector.jar file
//step1 : import packages
import java.sql.*;
import javax.sql.*;

public class Connection1 {

	public static final String username="root";
	public static final  String password="vijay";
	public static final  String url = "jdbc:mysql://localhost:3306/demo1";
	public static void getConnection() {
	  Connection cn;	
	try {
		//ste2 : load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		/*step 3
		 * 1 : url/database
		 * 2  : username
		 * 3:password
		 */
		cn = DriverManager.getConnection(url,username,password);
		System.out.println(cn);
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}	
		
	}
}
