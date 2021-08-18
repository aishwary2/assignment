package com.yash.emp;

import java.util.Scanner;

import constants.Constants;
import employee_service_implementation.EmployeeServiceImpl;
import modal.Employee;

public class App 
{
	public static void main( String[] args )
	{  
		EmployeeServiceImpl esi=new EmployeeServiceImpl();  
		EmployeeServiceImpl.initEmployeeList();
		boolean flag=false;
		String choice;
		int c;
		System.out.println("ENTER 1  to Get Employee By ID");
		System.out.println("ENTER 2  to Get Employees By Name");
		System.out.println("ENTER 3  to Get Employees By Department");
		System.out.println("ENTER 4  to Get Employee By Mobile Number");
		System.out.println("ENTER 5  to Get High Salarised Employee");
		System.out.println("ENTER 6  to Get Department List");
		System.out.println("ENTER 7  to Get Maximum Salary From employee");
		System.out.println("ENTER 8  to Get Expenditure of Company W.R.T Employee");
		System.out.println("ENTER 9  to Get List Of Employees Whose Bond Is not over yet");
		System.out.println("ENTER 10 to Get Sorter List Of Employee W.R.T salary");
		System.out.println("Enter 11 to Increment salary of an Employee by ID in percentage");
		System.out.println("ENTER 0  to Exit");
		do {

			System.out.println("Enter Your Choice");
			Scanner sc=new Scanner(System.in);

			choice=sc.nextLine();

			switch (choice) {
			case Constants.CONSTANT_1:
				esi.getEmployeeeById();
				flag=true;
				break;
			case Constants.CONSTANT_2:
				esi.getEmployeeByName();
				flag=true;
				break;
			case Constants.CONSTANT_3:
				esi.getEmployeeByDept();
				flag=true;
				break;
			case Constants.CONSTANT_4:
				esi.getEmployeeByMobileNo();
				flag=true;
				break;
			case Constants.CONSTANT_5:
				esi.getHighSalarisedEmployee();
				flag=true;
				break;
			case Constants.CONSTANT_6:
				esi.getDeptList();
				flag=true;
				break;
			case Constants.CONSTANT_7:
				esi.getMaxSalaryOfEmployee();
				flag=true;
				break;
			case Constants.CONSTANT_8:
				esi.getCompleteExpenditure();
				flag=true;
				break;
			case Constants.CONSTANT_9:
				esi.bondStatus();
				flag=true;
				break;
			case Constants.CONSTANT_10:
				esi.getSortedListOnSalary();
				flag=true;
				break;
			case Constants.CONSTANT_11:
				esi.incrementSalaryById();
				flag=true;
				break;
			case Constants.CONSTANT_0:
				System.out.println("Program has ended");
				flag=false;
				break;

			default:
				System.out.println("Not a valid choice TRY AGAIN");
				flag=true;
				break;
			}
		}while(flag);
	
	}
} 
