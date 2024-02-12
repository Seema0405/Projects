package com.task.service;
import java.sql.SQLException;

import com.task.bean.*;
import com.task.dao.*;

public class EmployeeServiceImpl implements IEmployeeService
{
	@Override
	public void insertEmployee(Employee_Bean e) throws ClassNotFoundException, SQLException
	{
		IEmployeeDao dao=new EmployeeDaoImpl();
		dao.insertEmployee(e);
	}
	public void updateEmployee(int uid, Employee_Bean e) throws ClassNotFoundException, SQLException
	{
		IEmployeeDao dao=new EmployeeDaoImpl();
		dao.updateEmployee(uid, e);
	}
	@Override
	public void selectEmployee() throws ClassNotFoundException, SQLException 
	{
		IEmployeeDao dao=new EmployeeDaoImpl();
		dao.selectEmployee();
	}
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException 
	{
		IEmployeeDao dao=new EmployeeDaoImpl();
		dao.deleteEmployee(did);
	}
	
}