package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateDao implements AutoCloseable {
	/* **Add new Candidate** */
	private Connection con;

	public CandidateDao() throws SQLException {
		con = DBUtil.getConnection();
	}

	@Override
	public void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public int saveCandidate(String name, String party, int votes) throws SQLException {
		String sql = "insert into candidates values(default,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.setString(2, party);
			stmt.setInt(3, votes);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	public int updateCandidate(int id, String name, String party) throws SQLException {
		String sql = "update candidates set name=?,party=? where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.setString(2, party);
			stmt.setInt(3, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	public List<PartyVotes> getPartywiseVotes() throws SQLException {
		List<PartyVotes> list = new ArrayList<PartyVotes>();
		String s = "select party,sum(votes) as vote_sum from candidates group by party";
		try (PreparedStatement stmt = con.prepareStatement(s)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String party = rs.getString("party");
					int votes = rs.getInt("vote_sum");
					System.out.printf("%s, %d\n", party, votes);
				}
			}
		}
		return list;

	}
}
