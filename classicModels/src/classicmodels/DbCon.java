package classicmodels;


public abstract class DbCon {

	public abstract void openCon(String url, String usr, String pwd) throws ClassNotFoundException;
	
	public abstract void closeCon();
}