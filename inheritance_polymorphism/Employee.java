package inheritance_polymorphism;

public class Employee extends Person {
double salary;
String insurance_number;
	public Employee(String name,double salary,String insurance_number) {
		super(name);
		this.salary=salary;
		this.insurance_number=insurance_number;
		// TODO Auto-generated constructor stub
	}
public void getEmployeeDetails() {
	System.out.println("Employee name: "+name+" Anual Salary: "+salary+" Insurance number: "+insurance_number);
}
}
