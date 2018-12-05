package demoInheritance;

public class Emp {
private long employeeId;
private String employeeName;
private String employeeAddress;
private Long EmployeePhone;
protected double basicSalary;
private double specialAllowence = 250.80;
private double Hra = 1000.50;

public Emp(long employeeId, String employeeName, String employeeAddress, long EmployeePhone, double basicSalary )
{
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.EmployeePhone = EmployeePhone;
	this.basicSalary = basicSalary;
}

public void calculatesalary()
{
	System.out.println("Emp Class salary");
}
public double CalculateTransportAllowence()
{
	double transportallownce = .1*basicSalary;
	return transportallownce;
	
}
public void Vacation()
{
	System.out.println("15 hours Vacations avalibale for Emp");
}
}
