package com.bridgelabz.employeepayrolljdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PayrollServiceJDBC {
    public static void main(String args[]) {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root",
					"root");
			Statement statement = connect.createStatement();
			if (statement != null) {
				System.out.println("connection is successful:");
			}
			ResultSet output = statement.executeQuery("select * from employee_payroll ;");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
