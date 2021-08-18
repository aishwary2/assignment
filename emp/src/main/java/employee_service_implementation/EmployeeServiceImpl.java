package employee_service_implementation;
import java.util.*;
import java.util.regex.Pattern;
import java.time.*;
import java.util.stream.*;
import employee_service.EmployeeService;
import exception.RecordNotFoundException;
import modal.Employee;
public class EmployeeServiceImpl implements EmployeeService{
	static List<Employee> e=new ArrayList<Employee>();
	public static void initEmployeeList() { 
		Employee e1=new Employee(1,"Sid","IT","1383838383",30000.0,24,LocalDate.of(2021, 7, 5));
		Employee e2=new Employee(2,"Sid","HR","8383838383",80000.0,24,LocalDate.of(2015, 1, 13));
		Employee e3=new Employee(3,"Sandeep","Testing","8383838383",30000.0,24,LocalDate.of(2021, 7, 5));
		Employee e4=new Employee(4,"Avtar","IT","8383838383",50000.0,24,LocalDate.of(2018, 4, 1));
		Employee e5=new Employee(5,"Cand","Accounts","8383838383",40000.0,24,LocalDate.of(2019, 10, 1));
		Employee e6=new Employee(6,"Bhav","IT","8383838383",65000.0,24,LocalDate.of(2017, 1, 5));
		Employee e7=new Employee(7,"Ufhiudh","Management","8383838383",60000.0,24,LocalDate.of(2017, 4, 1));
		Employee e8=new Employee(8,"Hnjn","Testing","1234567890",80000.0,24,LocalDate.of(2017, 1, 1));
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		e.add(e6);
		e.add(e7);
		e.add(e8);

	}
	int id;
	String name;
	String department;
    String mobNo;
    double per;

	@Override
	public void getEmployeeeById() {
		boolean flag=false;
		do {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter empId for fetching records");
				id=sc.nextInt();
				flag=false;
			
			}catch(Exception e) {
				System.out.println("Invalid Value try again");
				flag=true;
			}
		}while(flag);
		List<Employee> filter=  (ArrayList<Employee>) e.stream().filter(t->t.empId==id).limit(1).collect(Collectors.toList());
		if(filter.size()==0) {
			try {
				throw new RecordNotFoundException("No Such Record With Given Id");
			}catch(RecordNotFoundException e) {
				
			}
			}
		else
			System.out.println(filter);
		System.out.println("\n");
	}

	@Override
	public void getEmployeeByName() {
		boolean flag=false;
		do {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Employee Name for fetching records");
				name=sc.nextLine();
				flag=false;
				//sc.close();
			}catch(Exception e) {
				System.out.println("Invalid Value try again");
				flag=true;
			}
		}while(flag);
		List<Employee> filter=(ArrayList<Employee>) e.stream().filter(t->t.name.toLowerCase().equals(name.toLowerCase())).collect(Collectors.toList());
		if(filter.size()==0)
		{
			try {
				throw new RecordNotFoundException("No Such Record With Given Name");
			}catch(RecordNotFoundException e) {
				
			}
			}
		else
			System.out.println(filter);
	}

	@Override
	public void getEmployeeByDept() {
		boolean flag=false;
		do {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Employee Department for fetching records");
				department=sc.nextLine();
				flag=false;
				//sc.close();
			}catch(Exception e) {
				System.out.println("Invalid Value try again");
				flag=true;
			}
		}while(flag);
		List<Employee> filter=(ArrayList<Employee>) e.stream().filter(t->t.department.toLowerCase().equals(department.toLowerCase())).collect(Collectors.toList());
		if(filter.size()==0)
		{
			try {
				throw new RecordNotFoundException("No Such Record With Given Department");
			}catch(RecordNotFoundException e) {
				
			}
			}
		else
			System.out.println(filter);

	}

	@Override
	public void getEmployeeByMobileNo()  {
		boolean flag=false;
		do {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Employee Mobile Number for fetching records");
				mobNo=sc.nextLine();
				Pattern p=Pattern.compile("[0-9]{10}");
				if(p.matcher(mobNo).matches())
				flag=false;
				else {
					System.out.println("Mobile number should be of 10 digits without any character");	
					flag=true;
					
				}
			
			}catch(Exception e) {
				//System.out.println(e);
				System.out.println("Invalid Value try again");
				flag=true;
			}
			
		}while(flag);
		List<Employee> filter=(ArrayList<Employee>) e.stream().filter(t->t.mobileNo.equals(mobNo)).collect(Collectors.toList());
		if(filter.size()==0)
		{
			try {
				throw new RecordNotFoundException("No Such Record With Given Mobile Number");
			}catch(RecordNotFoundException e) {
				
			}
			}
		else
			System.out.println(filter);


	}

	@Override
	public void getHighSalarisedEmployee() {
		// TODO Auto-generated method stub
		double maxSalary;
Optional<Employee> sal=e.stream().reduce((e1,e2)->e1.salary>e2.salary?new Employee(1,"Sid","IT","1383838383",e1.salary,24,LocalDate.of(2021, 7, 5)):new Employee(1,"Sid","IT","1383838383",e2.salary,24,LocalDate.of(2021, 7, 5)));
//if(sal.isPresent())
	maxSalary=sal.get().salary;
	//System.out.println(maxSalary);
	List<Employee> filter=  (ArrayList<Employee>) e.stream().filter(t->t.salary==maxSalary).collect(Collectors.toList());
	System.out.println("Employee With Highest salary");
		System.out.println(filter);
    
	
	}

	@Override
	public void getDeptList() {

		HashSet<String> dept = new HashSet<String>();
    e.stream().forEach(x->dept.add(x.department.toUpperCase()));
    System.out.println("Distinct Department List");
    System.out.println(dept);
	}

	@Override
	public void getMaxSalaryOfEmployee() {
		double maxSalary;
		Optional<Employee> sal=e.stream().reduce((e1,e2)->e1.salary>e2.salary?new Employee(1,"Sid","IT","1383838383",e1.salary,24,LocalDate.of(2021, 7, 5)):new Employee(1,"Sid","IT","1383838383",e2.salary,24,LocalDate.of(2021, 7, 5)));
		//if(sal.isPresent())
			maxSalary=sal.get().salary;
			System.out.println("Maximum Salary Among All the employees is :  "+maxSalary + " per month");

	}

	@Override
	public void getCompleteExpenditure() {
		System.out.println("Expenditure Of the Company  w.r.t Employees");
		Optional<Employee> expenditure=e.stream().reduce((emp1,emp2)->new Employee(1,"Sid","IT","1383838383",emp1.salary+emp2.salary,24,LocalDate.of(2021, 7, 5)));
		if(expenditure.isPresent())
			System.out.println(expenditure.get().salary);
	}
	@Override
  public void bondStatus() {
		System.out.println("List of employee whose bond period is not over yet");
		List<Employee> empBondNotOver=e.stream().filter(l->l.checkBondStatus(l)).collect(Collectors.toList());
		System.out.println(empBondNotOver);
			
  }
public void getSortedListOnSalary() {
	e.stream().sorted().forEach(c->System.out.println(c));
}

@Override
public void incrementSalaryById() {
	boolean flag=false;
	boolean flag1=false;
	do {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter empId whose salary to be incremented");
			id=sc.nextInt();
			flag=false;
		
		}catch(Exception e) {
			System.out.println("Invalid ID try again");
			flag=true;
		}
	}while(flag);
	do {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter increment in percentage without '%'");
			per=sc.nextDouble();
			flag1=false;
		
		}catch(Exception e) {
			System.out.println("Invalid value try again");
			flag1=true;
		}
	}while(flag1);
	List<Employee> ee=e.stream().filter(l->l.empId==id).map(m->m.incrementSalaryInPercentage(m,per)).collect(Collectors.toList());
	if(ee.size()==0) {
		try {
			throw new RecordNotFoundException("No Such Record With Given Id");
		}catch(RecordNotFoundException e) {
			
		}
	}
}

	
}
