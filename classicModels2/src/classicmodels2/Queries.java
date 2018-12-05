package classicmodels2;

public class Queries {

	public static String selectAll = "SELECT * FROM customers WHERE creditLimit > ? and addressLine2 != ? ";
	
	public static String insert = "INSERT INTO car (vinNumber, plateNumber, modelNumber, color, carYear)"
	+ "VALUES (1243098,'VFR-345', 234, 'blue', '2019-04-11')";
	
	public static String update = "UPDATE customers SET country = ? WHERE customerNumber = ?";
	
}
