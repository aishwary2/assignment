package employee_service;
import constants.Constants;

public interface EmployeeService {
public void getEmployeeeById();
public void getEmployeeByName();
public void getEmployeeByDept();
public void getEmployeeByMobileNo();
public void getHighSalarisedEmployee();
public void getDeptList();
public void getMaxSalaryOfEmployee();
public void getCompleteExpenditure();
public void bondStatus();
public void incrementSalaryById();


default String getCompanyName() {
	return Constants.COMPANY_NAME;
}
}
