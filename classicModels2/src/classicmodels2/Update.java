package classicmodels2;

import java.sql.SQLException;
import java.util.Scanner;


public class Update extends DbCon {

	
	public void update() throws SQLException, ClassNotFoundException {
		openCon();
		ps = con.prepareStatement(Queries.selectAll);
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Which country would you like to update?");
			String country = sc.next();
		
			System.out.println("For which customer number would you like to update?");
			int num = sc.nextInt();
			
			ps.setInt(2, num);
			ps.setString(1, country);
			ps.executeQuery();
			System.out.println("Update complete!");
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			closeCon();
			
		}
	}

		

}
