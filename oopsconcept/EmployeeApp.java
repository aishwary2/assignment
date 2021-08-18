package oopsconcept;

import regularexpression.Manager;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e =new Employee();
		Manager m=new Manager();
		//System.out.println(m.msalary);//msalary is not visible as it is protected and is in another package
		System.out.println(m.mid);
		System.out.println(e.id);//protected and in same package works
		System.out.println(e.salary);//default is accesible in same package
	}

}
