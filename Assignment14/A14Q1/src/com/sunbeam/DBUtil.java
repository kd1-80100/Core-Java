package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static final String Db_Driver = "com.mysql.cj.jdbc.Driver";
	public static final String Db_Url = "jdbc:mysql://localhost:3306/karad";
	public static final String Db_UserId = "kd1_80100_pavanpatil";
	public static final String DbPassword = "manager";
	static {
		try {
			Class.forName(Db_Driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(Db_Url, Db_UserId, DbPassword);
		return con;
	}
}
