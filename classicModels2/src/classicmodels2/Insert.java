package classicmodels2;

import java.sql.SQLException;
import java.util.Scanner;

public class Insert extends DbCon {
	
	public void insert() throws SQLException, ClassNotFoundException {
		
		openCon();
		try {
			ps = con.prepareStatement(Queries.insert);
			ps.execute();
			System.out.println("Insertion complete!");
			
		} catch(SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			closeCon();
			
		}
		
		
	}	

}