
package com.task.ui;

import com.task.bean.Employee_Bean;
import com.task.service.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Demo_CRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("select your option");
			System.out.println("1. insert employee data");// create
			System.out.println("2. update employee data");// update
			System.out.println("3  select employee data");// read
			System.out.println("4  delete employee data");// delete
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				insertEmployee();
				break;
			}
			case 2: {
				updateEmployee();
				break;
			}
			case 3: {
				selectEmployee();
				break;
			}
			case 4: {
				deleteEmployee();
				break;
			}
			default: {
				System.out.println("your entered option is not match");
				break;
			}
			}
		} while (true);

	}

	private static void insertEmployee() throws ClassNotFoundException, SQLException {
		IEmployeeService service = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id: ");
		int id = sc.nextInt();
		System.out.println("Enter your Name: ");
		String name = sc.next();
		System.out.println("Enter your Address: ");
		String address = sc.next();
		Employee_Bean e = new Employee_Bean(id, name, address);
		service.insertEmployee(e);

	}

	private static void deleteEmployee() throws ClassNotFoundException, SQLException {

		IEmployeeService es = new EmployeeServiceImpl();
		System.out.println("Enter Id to delete employee: ");
		Scanner sc = new Scanner(System.in);
		int did = sc.nextInt();
		es.deleteEmployee(did);

	}

	private static void selectEmployee() throws ClassNotFoundException, SQLException {

		IEmployeeService es = new EmployeeServiceImpl();
		es.selectEmployee();

	}

	private static void updateEmployee() throws ClassNotFoundException, SQLException {

		IEmployeeService service = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id of Employee you want to update: ");
		int uid = sc.nextInt();
		System.out.println("Enter New Id: ");
		int id = sc.nextInt();
		System.out.println("Enter New Name: ");
		String name = sc.next();
		System.out.println("Enter New Address: ");
		String address = sc.next();
		Employee_Bean e = new Employee_Bean(id, name, address);
		service.updateEmployee(uid, e);

	}

}