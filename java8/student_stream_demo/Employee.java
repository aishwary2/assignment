package java8.student_stream_demo;

import java.time.*;

import collection_framework.customer.Customer;

public class Employee implements Comparable<Employee>{
int empId;
String name;
String designation;
double salary;
int bondDurationInMonth;
LocalDate dateOfJoining;
public Employee(int empId, String name, String designation, double salary, int bondDurationInMonth,
		LocalDate dateOfJoining) {
	super();
	this.empId = empId;
	this.name = name;
	this.designation = designation;
	this.salary = salary;
	this.bondDurationInMonth = bondDurationInMonth;
	this.dateOfJoining = dateOfJoining;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary
			+ ", bondDurationInMonth=" + bondDurationInMonth + ", dateOfJoining=" + dateOfJoining + "]";
}

public Employee incrementSalaryInPercentage(Employee e,int percentage) {
	e.salary=e.salary+(e.salary*percentage/100);
	System.out.println("Salary of "+e.name+" updated to "+e.salary);
	return e;
}
public boolean  checkBondStatus(Employee e) {
	LocalDate date=e.dateOfJoining;
	LocalDate dateNow=LocalDate.now();
	Period p=Period.between(date, dateNow);
	int years =p.getYears();
	int months = p.getMonths();
int numberOfMonths=  months+years*12;
if(numberOfMonths<e.bondDurationInMonth)
	return true;
else
	return false;
}
@Override
//public int compareTo(Employee o) {
//	// TODO Auto-generated method stub
//	if(this.salary==o.salary)
//		return 0;
//		else if(this.salary>o.salary)
//			return 1;
//		else return -1;
//}
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	if(this.name==o.name)
		return 0;
		else if(this.name.compareTo(o.name)>0)
			return 1;
		else return -1;
}

	
}
