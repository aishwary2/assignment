package java8.student_stream_demo;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class EmployeeMain {
	
public static void main(String[] args) {
	Employee e1=new Employee(1,"Sid","Trainee",30000.0,24,LocalDate.of(2021, 7, 5));
	Employee e2=new Employee(1,"Josh","Sr.Manager",80000.0,24,LocalDate.of(2015, 1, 13));
	Employee e3=new Employee(1,"Sandeep","Trainee",30000.0,24,LocalDate.of(2021, 7, 5));
	Employee e4=new Employee(1,"Avtar","Sr.Developer",50000.0,24,LocalDate.of(2018, 4, 1));
	Employee e5=new Employee(1,"Cand","Jr.Developer",40000.0,24,LocalDate.of(2019, 10, 1));
	Employee e6=new Employee(1,"Bhav","Jr.Manager",65000.0,24,LocalDate.of(2017, 1, 5));
	Employee e7=new Employee(1,"Ufhiudh","Team Lead",60000.0,24,LocalDate.of(2017, 4, 1));
	Employee e8=new Employee(1,"Hnjn","Team Lead",60000.0,24,LocalDate.of(2017, 1, 1));
	ArrayList<Employee> e=new ArrayList<Employee>();
	e.add(e1);
	e.add(e2);
	e.add(e3);
	e.add(e4);
	e.add(e5);
	e.add(e6);
	e.add(e7);
	e.add(e8);
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
	
	
	System.out.println("Expenditure Of the Company  w.r.t Employees");
Optional<Employee> expenditure=e.stream().reduce((emp1,emp2)->new Employee(emp1.empId,emp1.name,emp1.designation,emp1.salary + emp2.salary,emp1.bondDurationInMonth,emp1.dateOfJoining));
if(expenditure.isPresent())
	System.out.println(expenditure.get().salary);
	
	
}
}
