package classicmodels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select extends DbCon {
	
	Connection con = null;

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
	
	
	public void fetch() throws SQLException, ClassNotFoundException{
			
			String query = "SELECT * FROM customers";
			System.out.println("hello");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
		
			
			while(rs.next()) {
				
				int cnum = rs.getInt("customerNumber");

				String cname = rs.getString("customerName");
				String clname = rs.getString("contactLastName");
				String cfname = rs.getString("contactFirstName");
				String phone = rs.getString("phone");
				
				//Display values
				System.out.print("customer number: " + cnum + ", Customer name: " + 
				cname + ", Contact last name: " + clname + ", Contact First name: " + 
				cfname + ", Phone " + phone + "\n" );
				
				
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
			
	
			
			

	
