package com.user.available.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.user.available.dao.UserAvailableDao;

public class UserAvailableDaoImpl implements UserAvailableDao {

	private static final String SQL = "SELECT * FROM USER WHERE userId = ";

	private static final String SECUIRTY_SQL = "SELECT * FROM USER_SECURITY WHERE userId = ";

	private static final String POPULATE_USER_SQL = "SELECT * FROM USER WHERE userName like '";

	private Connection connection;

	public String userAvailabilityServiceDao(String userId) {
		String status = null;
		connection = getConnection();
		try {
			System.out.println("userId:" + userId);
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(SQL + userId);
			while (rs.next()) {
				return "exsisting user";
			}
			status = "user available";
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	private Connection getConnection() {
		connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/suda", "root", "system");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	@Override
	public String fetchSecurityQuestion(String userId) {
		connection = getConnection();
		String securityQuestion = "unavailable";
		try {
			System.out.println("userId:" + userId);
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(SECUIRTY_SQL + userId);
			while (rs.next()) {
				securityQuestion = rs.getString(2);
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return securityQuestion;
	}

	@Override
	public String validateResetPassword(String userId) {
		connection = getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(SQL + userId);
			while (rs.next()) {
				return rs.getString(3);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> populateUserDetails(String userName) {
		connection = getConnection();
		List<String> userList = new ArrayList<String>();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(POPULATE_USER_SQL + userName+"%';");
			while(rs.next()) {
				String temp="";
				for(int i =0;i<9;i++) {
					temp+=rs.getString(i)+",";
				}
			}
		}catch (Exception e) {

		}
		return null;
	}
}
