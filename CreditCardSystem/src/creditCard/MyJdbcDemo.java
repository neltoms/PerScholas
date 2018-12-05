package creditCard;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


public class MyJdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		
		try {
		// Register the driver or create an instance of the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		// Create database credentials
		final String dbUrl = "jdbc:mysql://localhost:3306/classicmodels";
		final String username = "root";
		final String password = "password";
		
		
		System.out.println("Connecting to Database....");
		// Create connection Driver object
		con = DriverManager.getConnection(dbUrl ,username, password);
		System.out.println("Database connection established!");
		
		// Create statement to prepare query
		
		String query = "SELECT * FROM station";
	
		Statement stmt = con.createStatement();
		
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			
			int a = rs.getInt("stationid");
			String b = rs.getString("name");
			float c = rs.getFloat("datacoverage");
			String d = rs.getString("Country");
			
			System.out.println("Station ID is: " + a);
			System.out.println("Station Name is: " + b);
			System.out.println("Data Coverage is: " + c);
			System.out.println("Country is: " + d + "\n");
		}
		
		} catch(SQLException e) {
			
			System.out.println("Database connection error!");
			
		} finally {
			
			con.close();
			
		} try {
			
			con.close();
			
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
