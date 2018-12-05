package classicmodels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert extends DbCon {
	
	
	Connection con = null;

	@Override
	public void openCon(String url, String usr, String pwd) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connecting to Database....");
		try{
		con = DriverManager.getConnection(url, usr, pwd);
		System.out.println("Database connection established");
	} catch(SQLException e){
		System.out.println(e.getStackTrace());
	} 
		
	}
	
	public void insert() throws SQLException {
		String query = "INSERT INTO car (vinNumber, plateNumber, modelNumber, color, carYear)"
				+ "VALUES (1243,'VFR-345', 234, 'blue', '2019-04-11')";
		Statement stmt = con.createStatement();
		try {
			stmt.execute(query);
			System.out.println("Insertion complete!");
			
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}	

	@Override
	public void closeCon() {
		try {
			con.close();
			
		} catch (SQLException e) {
			
			System.out.println(e.getStackTrace());
		}
		
	}


}
