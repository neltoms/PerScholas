package classicmodels;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String usr = "root";
		String pwd = "password";
		
		
		Select sec = new Select();
		sec.openCon(url, usr, pwd);
		sec.fetch();
		sec.closeCon();	
		
		Insert ins = new Insert();
		ins.openCon(url, usr, pwd);
		ins.insert();
		ins.closeCon();
		
		Update upd = new Update();
		upd.openCon(url, usr, pwd);
		upd.update();
		upd.closeCon();
		
		

	}


}
