package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/karad";
	public static final String DB_User = "kd1_80100_pavanpatil";
	public static final String DB_Password = "manager";

	static {
		try {
			Class.forName(DB_Driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static Connection getConnection() throws SQLException {
		Connection con= DriverManager.getConnection(DB_URL, DB_User, DB_Password);
		return con;
	}
}
