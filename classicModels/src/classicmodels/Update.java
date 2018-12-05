package classicmodels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update extends DbCon {
	
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
	
	public void update() throws SQLException {
		String query = "UPDATE customers SET country = 'Estonia' WHERE customerNumber = 103";
		Statement stmt = con.createStatement();
		try {
			boolean exec = stmt.execute(query);
			System.out.println("Update complete!");
			
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
