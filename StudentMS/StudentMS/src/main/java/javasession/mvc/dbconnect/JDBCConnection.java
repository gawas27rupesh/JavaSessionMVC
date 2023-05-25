package javasession.mvc.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

import javasession.mvc.constant.DBConstant;

public class JDBCConnection {
	public static Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName(DBConstant.CLASS_NAME);
			connection= DriverManager.getConnection(DBConstant.DB_URL,DBConstant.DB_USER,DBConstant.DB_PASSWORD);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return connection;
		
	}

}
