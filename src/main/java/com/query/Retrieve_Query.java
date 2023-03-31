package com.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrieve_Query {

	public static void main(String[] args) {

		Connection c = null;

		Statement statement = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");

			statement = c.createStatement();

			statement.execute("SELECT count(*) from employee_data");

			

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (c != null) {

					c.close();

				}
			} catch (Exception e2) {
			}

		}

	}

}
