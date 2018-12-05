package classicmodels2;

import java.sql.SQLException;

public class MainDbCon {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		Select sec = new Select();
		sec.fetch();
		
		Insert ins = new Insert();
		ins.insert();
		
		Update upd = new Update();
		upd.update();
		
		

	}


}
