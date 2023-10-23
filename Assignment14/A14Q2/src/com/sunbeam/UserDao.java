package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable {
	private Connection con;

	public UserDao() throws SQLException {
		con = DBUtil.getConnection();
	}

	@Override
	public void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

	// Insert user into table.
	public int insertUser(String fName, String lName, String email, String password, String date)
			throws SQLException, ParseException {
		String sql = "insert into users values (default,?,?,?,?,?,0,'voter')";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, fName);
			stmt.setString(2, lName);
			stmt.setString(3, email);
			stmt.setString(4, password);

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(date);
			java.sql.Date sDate = new Date(uDate.getTime());
			stmt.setDate(5, sDate);
			int count = stmt.executeUpdate();
			return count;
		}
	}

	// Delete user from table.
	public int deleteUser(int id) throws SQLException {
		String sql = "delete from users where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int count = stmt.executeUpdate();
			return count;
		}
	}

	// Update user.
	public int updateUser(int id, String fName, String lName, String email) throws SQLException {
		String sql = "update users set first_name=?,last_name=?,email=? where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, fName);
			stmt.setString(2, lName);
			stmt.setString(3, email);
			stmt.setInt(4, id);
			int count = stmt.executeUpdate();
			return count;
		}
	}

	// Display all users.
	public List<User> displayAllUser() throws SQLException {
		List<User> list = new ArrayList<User>();
		String sql = "select * from users;";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id1 = rs.getInt("id");
					String fName = rs.getString("first_name");
					String lName = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					java.sql.Date date = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String sDate = sdf.format(date);
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User u = new User(id1, fName, lName, email, password, sDate, status, role);
//					User u= new User();
//					u.setfName(fName);
//					u.setlName(lName);
//					u.setEmail(email);
//					u.setPassword(password);
//					u.setDate(sDate);
//					u.setStatus(status);
//					u.setRole(role);
					list.add(u);
				}
			}
			return list;
		}
	}

	// Display users with custom id.
	public List<User> customDisplay(int uId) throws SQLException {
		List<User> list = new ArrayList<User>();
		String sql = "select * from users where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, uId);
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getNString("first_name");
					String lname = rs.getNString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					java.sql.Date sDate = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String date = sdf.format(sDate);
					Boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User u = new User(id, fname, lname, email, password, date, false, role);
					list.add(u);
				}
			}
			return list;
		}
	}

	// Change voting status from 'not voted' to 'voted'.
	public int updateValue(int uid1) throws SQLException {
		String sql = "update users set status=true where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, uid1);
			int count = stmt.executeUpdate();
			return count;
		}
	}

}
