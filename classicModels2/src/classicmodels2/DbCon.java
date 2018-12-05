package classicmodels2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DbCon {
	
	protected Statement st = null;
	protected ResultSet rs = null;
	protected PreparedStatement ps = null;
	protected Connection con = null;
	

	public void openCon() throws ClassNotFoundException{
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String usr = "root";
		String pwd = "password";
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connecting to Database....");
		try{
		con = DriverManager.getConnection(url, usr, pwd);
		System.out.println("Database connection established");
	} catch(SQLException e){
		System.out.println(e.getStackTrace());
	}
		
	}
	
	public void closeCon() {
		
		try {
			
			con.close();
			
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
	}
}




