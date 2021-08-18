package modal;

import java.time.*;


public class Employee implements Comparable<Employee>{
public int empId;
public String name;
public String department;
public String mobileNo;
public double salary;
public int bondDurationInMonth;
public LocalDate dateOfJoining;

public Employee(int empId, String name, String department,String mobileNo, double salary, int bondDurationInMonth,
		LocalDate dateOfJoining) {
	super();
	this.empId = empId;
	this.name = name;
	this.department = department;
	this.mobileNo=mobileNo;
	this.salary = salary;
	this.bondDurationInMonth = bondDurationInMonth;
	this.dateOfJoining = dateOfJoining;
}


@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + ", mobileNo=" + mobileNo
			+ ", salary=" + salary + ", bondDurationInMonth=" + bondDurationInMonth + ", dateOfJoining=" + dateOfJoining
			+ "]";
}


public Employee incrementSalaryInPercentage(Employee e,double percentage) {
	e.salary=e.salary+(e.salary*percentage/100);
	System.out.println("Salary of "+e.name+" With Employee ID "+e.empId+" updated to "+e.salary);
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
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	if(this.salary==o.salary)
		return 0;
		else if(this.salary>o.salary)
			return 1;
		else return -1;
}
//public int compareTo(Employee o) {
//	// TODO Auto-generated method stub
//	if(this.name==o.name)
//		return 0;
//		else if(this.name.compareTo(o.name)>0)
//			return 1;
//		else return -1;
//}

	
}







//	Employee e1=new Employee(1,"Sid","Trainee","8383838383",30000.0,24,LocalDate.of(2021, 7, 5));
//	Employee e2=new Employee(1,"Josh","Sr.Manager","8383838383",80000.0,24,LocalDate.of(2015, 1, 13));
//	Employee e3=new Employee(1,"Sandeep","Trainee""8383838383",,30000.0,24,LocalDate.of(2021, 7, 5));
//	Employee e4=new Employee(1,"Avtar","Sr.Developer","8383838383",50000.0,24,LocalDate.of(2018, 4, 1));
//	Employee e5=new Employee(1,"Cand","Jr.Developer","8383838383",40000.0,24,LocalDate.of(2019, 10, 1));
//	Employee e6=new Employee(1,"Bhav","Jr.Manager","8383838383",65000.0,24,LocalDate.of(2017, 1, 5));
//	Employee e7=new Employee(1,"Ufhiudh","Team Lead","8383838383",60000.0,24,LocalDate.of(2017, 4, 1));
//	Employee e8=new Employee(1,"Hnjn","Team Lead","8383838383",60000.0,24,LocalDate.of(2017, 1, 1));
//	ArrayList<Employee> e=new ArrayList<Employee>();
//	e.add(e1);
//	e.add(e2);
//	e.add(e3);
//	e.add(e4);
//	e.add(e5);
//	e.add(e6);
//	e.add(e7);
//	e.add(e8);
//	System.out.println("13% raise on the salary of employee whose salary is less than or equal to 50000 ");
//	List<Employee> empsal=e.stream().filter(l->l.salary<=50000).map(m->m.incrementSalaryInPercentage(m,13)).collect(Collectors.toList());
//	System.out.println(empsal);
	
	
//	System.out.println("List of employee whose bond period is not over yet");
//	List<Employee> empBondNotOver=e.stream().filter(l->l.checkBondStatus(l)).collect(Collectors.toList());
//	System.out.println(empBondNotOver);
	
	
//	System.out.println("Sort Employees By Name");
//	e.stream().sorted().forEach(c->System.out.println(c));
	
	
//	System.out.println("List Of Employees Whose Name Starts By 'S'");
//	 List<Employee> nameStartsWith = e.stream().filter(s->s.name.startsWith("S")).
//             collect(Collectors.toList());
//System.out.println(nameStartsWith);
	
//	
//	System.out.println("Expenditure Of the Company  w.r.t Employees");
//Optional<Employee> expenditure=e.stream().reduce((emp1,emp2)->new Employee(emp1.empId,emp1.name,emp1.designation,emp1.salary + emp2.salary,emp1.bondDurationInMonth,emp1.dateOfJoining));
//if(expenditure.isPresent())
//	System.out.println(expenditure.get().salary);
//	
