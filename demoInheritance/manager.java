package demoInheritance;

public class manager extends Emp  {
public manager(long employeeId, String employeeName, String employeeAddress, long EmployeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, EmployeePhone, basicSalary);



}

public void  calculatesalary()
{
	System.out.println("Manager Class Salary");
}

public void managervacation()
{
	System.out.println("40 hours Vacations for manager");
}


}
