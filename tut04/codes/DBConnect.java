package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    private static String DB_URL = "jdbc:mysql://localhost:3306/userdb?useSSL=false";
    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD = "root";
	
	public static Connection getConnection()  {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return conn;
	}
}
